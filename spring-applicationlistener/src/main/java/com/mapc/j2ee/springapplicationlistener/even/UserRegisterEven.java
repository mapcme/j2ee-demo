package com.mapc.j2ee.springapplicationlistener.even;

import com.mapc.j2ee.springapplicationlistener.entity.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/31 09:18
 */
@Getter
public class UserRegisterEven extends ApplicationEvent {

    private User user;

    public UserRegisterEven(Object source,User user) {
        super(source);
        this.user=user;
    }
}
