package com.sml.xcx.web.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author :mmzs
 * @description:websocket类
 * @date :2020/05/27 14:33
 */
@ServerEndpoint(value = "/ws/{room}")
@Component
@Slf4j
public class WebSocketServer {
    //新：使用map对象，便于根据userId来获取对应的WebSocket
    private static ConcurrentHashMap<String,WebSocketServer> websocketList = new ConcurrentHashMap<>();
    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    private String room;

    public static WebSocketServer getWebsocket(String room){
        return websocketList.get(room);
    }

    @OnOpen
    public void onOpen(Session session, @PathParam("room") String room) {
        log.info("websocket open: {}", room);
        this.session = session;

        WebSocketServer old = websocketList.get(room);
        if (old != null) {
            try {
                old.session.close();
            } catch (IOException e) {
                log.error("websocket close error! {}", e.fillInStackTrace());
            }
        }
        websocketList.put(room, this);
        this.room = room;
    }

    @OnClose
    public void onClose() {
        log.info("websocket close: {}", this.room);
        if (websocketList.get(this.room) != null) {
            websocketList.remove(this.room);
        }
    }

    @OnMessage
    public void onMessage(String message) {
        log.info("收到客户端消息: {}", message);
        //和客户端保持联系
        if(message.equals("ping")){
            sendMessage("pong");
        }
    }

    @OnError
    public void onError(Throwable throwable) {
        log.error("connect error: {}", throwable);
    }

    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) {
        this.session.getAsyncRemote().sendText(message);
    }

    /**
     * 在线群发
     *
     * @param message
     */
    public static void sendAllMessage(String message) {
        for (WebSocketServer server : websocketList.values()) {
            server.sendMessage(message);
        }
    }
}
