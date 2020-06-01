package com.sml.xcx.web.controller.token;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sml.xcx.annotations.UserLoginToken;
import com.sml.xcx.common.CodeEnum;
import com.sml.xcx.entity.User;
import com.sml.xcx.entity.base.Result;
import com.sml.xcx.service.IUserService;
import com.sml.xcx.util.TokenUtil;
import com.sml.xcx.web.Service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :mmzs
 * @description:token测试
 * @date :2020/06/01 14:11
 */
@RestController
public class UserApi {

    @Autowired
    IUserService userService;

    @Autowired
    TokenService tokenService;

    //登录
    @GetMapping(value = "login")
    public Result login(User user, HttpServletResponse response) {
        Result result = new Result();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        User userForBase = userService.getOne(queryWrapper);
        if(!userForBase.getPassword().equals(user.getPassword())) {
            result.setResult(CodeEnum.code10010);
            return result;
        }
        String token = tokenService.getToken(userForBase);
        result.setResult(token);
        Cookie cookie = new Cookie("token", token);
        cookie.setPath("/");
        response.addCookie(cookie);
        return result;
    }

    @UserLoginToken
    @GetMapping(value = "getMessage")
    public String getMessage() {
        System.out.println(TokenUtil.getTokenUserId());
        return "您已通过验证";
    }
}
