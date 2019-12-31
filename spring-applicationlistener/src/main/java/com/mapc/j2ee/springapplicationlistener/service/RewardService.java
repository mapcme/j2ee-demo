package com.mapc.j2ee.springapplicationlistener.service;

import com.mapc.j2ee.springapplicationlistener.even.UserRegisterEven;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/31 09:33
 */
@Component
public class RewardService {

    @Async
    @Order(2)
    @EventListener
    public void init(UserRegisterEven userRegisterEven){
        System.out.println("积分初始化，"+userRegisterEven.getUser().toString());
    }
}
