package com.sml.xcx.service.master.impl;

import com.sml.xcx.entity.master.User;
import com.sml.xcx.mapper.master.UserMapper;
import com.sml.xcx.service.master.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
