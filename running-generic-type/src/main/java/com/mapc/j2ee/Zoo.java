package com.mapc.j2ee;

import java.util.ArrayList;

public class Zoo {

    private static ArrayList<Animal> animals=new ArrayList<>();

    public void join(Animal animal){
        animals.add(animal);
        System.out.println(animal.getName()+"加入动物园！");
    }

}
