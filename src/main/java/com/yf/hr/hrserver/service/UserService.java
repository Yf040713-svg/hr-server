package com.yf.hr.hrserver.service;

import com.yf.hr.hrserver.pojo.User;

public interface UserService {
    User findById(Integer id);
}