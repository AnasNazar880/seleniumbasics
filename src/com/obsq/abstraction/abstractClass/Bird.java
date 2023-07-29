package com.obsq.abstraction.abstractClass;

public class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("eats bird food");
    }

    @Override
    void move() {
        System.out.println("moves by flying");
    }


}
