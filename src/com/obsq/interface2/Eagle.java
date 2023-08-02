package com.obsq.interface2;

public class Eagle implements Animal,Bird{
    @Override
    public void eat() {
        System.out.println("eats ambhibians and reptails");
    }

    @Override
    public void fly() {
        System.out.println("flies up to 10000feet");
    }

    @Override
    public void sound() {
        System.out.println("has a high pitched whisling sound");
    }
}

