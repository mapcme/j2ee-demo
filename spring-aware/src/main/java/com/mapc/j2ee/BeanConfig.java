package com.mapc.j2ee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initEntity")
    public Dog dog(){
        return new Dog();
    }

    @Bean(destroyMethod = "destoryEntity2")
    public Cat cat(){
        return new Cat();
    }
}
