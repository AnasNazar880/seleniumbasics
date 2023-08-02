package com.obsq.interface2;

public class TestEagleInterface {
    public static void main(String[] args) {


        Eagle eagle = new Eagle();
        eagle.sound();
        eagle.eat();
        eagle.fly();
        System.out.println("the number of legs: " + Bird.numberOfLugs);
        System.out.println("the outer covering:" + Bird.outerCovering);
    }
}
