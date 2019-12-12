package com.mapc.j2ee;

public interface Animal<T> {

    default String hello(){
        return "I`m an animal";
    }

    String getName();
}
