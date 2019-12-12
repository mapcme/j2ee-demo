package com.mapc.j2ee;

public class Cat<T> implements Animal<T>{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String hello() {
        return "I`m a cat";
    }

    @Override
    public String getName() {
        return name;
    }
}

