package com.yf.hr.hrserver.service.impl;

import com.yf.hr.hrserver.mapper.UserMapper;
import com.yf.hr.hrserver.pojo.User;
import com.yf.hr.hrserver.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}