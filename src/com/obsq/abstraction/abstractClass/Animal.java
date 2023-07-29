package com.obsq.abstraction.abstractClass;

public abstract class Animal {
    abstract void move();//abstract methods
    abstract void eat();
    //concrete methods
    void label(){
        System.out.println("Animals data ");
    }
}
