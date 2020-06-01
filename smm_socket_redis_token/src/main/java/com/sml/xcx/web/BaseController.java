package com.sml.xcx.web;

import com.sml.xcx.common.CodeEnum;
import com.sml.xcx.entity.base.Result;
import com.sml.xcx.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :cxs
 * @description:TODO
 * @date :2020/05/28 14:11
 */
@RestController
public class BaseController {

    @Autowired
    protected RedisUtils redisUtils;

    public static void setResult(Result result, CodeEnum code){
        result.setCode(code.getCode());
        result.setMsg(code.getDesc());
    }
}
