package com.obsq.polymethodovrriding;

public class TestBirdDynamic {
    public static void main(String[] args) {
        Animal2 animal=new Animal2();
        animal.eat();
        Bird2 bird=new Bird2();
        bird.eat();
    }
}
