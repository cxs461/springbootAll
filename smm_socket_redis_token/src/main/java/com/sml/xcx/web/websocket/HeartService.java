package com.sml.xcx.web.websocket;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author :cxs
 * @description:websocket发送心跳包，保持连接
 * @date :2020/05/28 14:07
 */
@Component
public class HeartService {
    /**
     * 心跳发送
     */
    @Scheduled(fixedRate = 50000)
    public void sendPong(){

        WebSocketServer.sendAllMessage("pong");
    }
}
