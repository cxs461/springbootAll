package com.sml.xcx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sml.xcx.entity.User;
import com.sml.xcx.mapper.UserMapper;
import com.sml.xcx.service.IUserService;
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

    public User findUserByuserName(String userName) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userName);
        return this.baseMapper.selectOne(queryWrapper);
    }
}
