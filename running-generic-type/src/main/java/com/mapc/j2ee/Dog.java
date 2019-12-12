package com.mapc.j2ee;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Dog<T> implements Animal<T>{

    private String name;

    private Class clazz;//用于接收运行期泛型类型

    @SuppressWarnings("unchecked")
    public Dog(String name){
        this.name=name;

    }


    @Override
    public String hello() {
        return "I`m a dog";
    }

    @Override
    public String getName() {
        return name;
    }
}
