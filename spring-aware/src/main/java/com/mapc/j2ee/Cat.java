package com.mapc.j2ee;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

public class Cat implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Cat中销毁方法：implements DisposableBean");
    }

    @PreDestroy
    public void destroyEntity(){
        System.out.println("Cat中销毁方法：@PreDestroy");
    }

    public void destoryEntity2(){
        System.out.println("Cat中销毁方法：@Bean(destory-method)");
    }
}
