package com.mapc.j2ee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;

public class Dog implements InitializingBean {
    private String a,b,c;



    @PostConstruct
    public void init(){
        System.out.println("初始化方式：@PostConstruct");
        this.a="初始化方式：@PostConstruct";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化方式：implements InitializingBean");
        this.b="初始化方式：implements InitializingBean";
    }

    public void initEntity()  {
        System.out.println("初始化方式：@Bean(init-method)");
        this.c="初始化方式：@Bean(init-method)";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
