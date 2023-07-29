package com.obsq.abstraction.abstractClass;

public class Fish extends Animal {
    @Override
    void move() {
        System.out.println("fish is swimming");
    }

    @Override
    void eat() {
        System.out.println("eats seafood");
    }
}
