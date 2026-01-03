package com.yf.hr.hrserver.controller;

import com.yf.hr.hrserver.pojo.User;
import com.yf.hr.hrserver.service.UserService;
import com.yf.hr.hrserver.util.TimeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;
    private final TimeUtil timeUtil;

    public UserController(UserService userService, TimeUtil timeUtil) {
        this.userService = userService;
        this.timeUtil = timeUtil;
    }

//    @GetMapping("/user/findById")
//    public User findById(Integer id) {
//        return userService.findById(id);
//    }

    @GetMapping("/time")
    public String time() {
        return timeUtil.now();
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "ok";
    }           //新增用户
}