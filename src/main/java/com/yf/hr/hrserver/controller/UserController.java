package com.yf.hr.hrserver.controller;

import com.yf.hr.hrserver.pojo.User;
import com.yf.hr.hrserver.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }
}