package com.mapc.j2ee;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

@SpringBootApplication
public class SpringAwareApplication implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private ApplicationEventPublisher applicationEventPublisher;


    public static void main(String[] args) {
        SpringApplication.run(SpringAwareApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean(Dog.class).toString());
        this.applicationContext=applicationContext;
    }
}
