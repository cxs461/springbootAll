package com.sml.xcx.service;

import com.sml.xcx.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-01
 */
public interface IUserService extends IService<User> {

    User findUserByuserName(String userName);
}
