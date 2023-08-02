package com.obsq.polymethodovrriding;


public class Bird2 extends Animal2 {
    @Override
    public void eat() {
        //super.eat();
        System.out.println("the birds eating fruits");
    }
}
