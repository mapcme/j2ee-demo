package com.mapc.j2ee.springapplicationlistener.controller;

import com.mapc.j2ee.springapplicationlistener.entity.User;
import com.mapc.j2ee.springapplicationlistener.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/31 09:13
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public void register(@RequestBody User user){
        userService.register(user);
    }
}
