package com.mapc.j2ee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController implements ApplicationContextAware {

    @Autowired
    private ApplicationEventPublisher publisher;
    private ApplicationContext applicationContext;


    @GetMapping
    public void destoryIOC(){
        publisher.publishEvent(new CustomeApplicationEvent("这是一个测试事件"));
    }

    @EventListener
    public void handleEvent(CustomeApplicationEvent e){
        System.out.println("监听到事件：");
        System.out.println(e.getData());
        System.out.println(applicationContext.getBean(Dog.class).toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
