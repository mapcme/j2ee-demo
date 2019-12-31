package com.mapc.j2ee.springapplicationlistener.service;

import com.mapc.j2ee.springapplicationlistener.even.UserRegisterEven;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/31 09:14
 */
@Async
@Order(1)
@Component
public class MailService implements ApplicationListener<UserRegisterEven> {
    @Override
    public void onApplicationEvent(UserRegisterEven userRegisterEven) {
        System.out.println("发送邮件，"+userRegisterEven.getUser().toString());
    }
}
