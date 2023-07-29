package com.obsq.interface1;

public interface Drawable {
void draw();
static int cube(int x){//static method
    return x*x*x;
}
default void message(){ //default method

        System.out.println("default method is here");
    }

}
