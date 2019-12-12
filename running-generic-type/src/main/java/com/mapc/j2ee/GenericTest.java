package com.mapc.j2ee;

import java.lang.reflect.GenericDeclaration;

public class GenericTest {

    public static void main(String[] args) {
        Animal<Zoo> animal=new Dog("小狗");
        System.out.println(animal);

    }
}
