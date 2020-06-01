package com.sml.xcx.web.controller.redis;

import com.sml.xcx.common.CodeEnum;
import com.sml.xcx.entity.base.Result;
import com.sml.xcx.web.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :mmzs
 * @description:TODO
 * @date :2020/05/28 14:09
 */
@RequestMapping(value = "/redis")
@RestController
@Slf4j
public class RedisController extends BaseController {

    @GetMapping("redis_text")
    public Result redisText() {
        Result result = new Result();
        try {
            redisUtils.set("cxs111","11111");
            String value = redisUtils.get("cxs111").toString();
            log.info(value);

        } catch (Exception e) {
            log.error("测试redis异常",e);
            setResult(result, CodeEnum.code8999);
        }
        return result;
    }
}
