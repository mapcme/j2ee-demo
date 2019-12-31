package com.mapc.j2ee.springapplicationlistener.service;

import com.mapc.j2ee.springapplicationlistener.entity.User;
import com.mapc.j2ee.springapplicationlistener.even.UserRegisterEven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/31 09:13
 */
@Service
public class UserService {

    @Resource
    private ApplicationContext applicationContext;

    public void register(User user){
        System.out.println("用户已经注册，"+user.toString());
        applicationContext.publishEvent(new UserRegisterEven(this,user));
    }
}
