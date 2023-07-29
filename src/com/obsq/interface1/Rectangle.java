package com.obsq.interface1;
//static Method using interface
public class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }

   public static void main(String[] args) {
        Drawable d=new Rectangle();
        d.draw();//non static method calling
       d.message();//default method calling
        System.out.println (Drawable.cube(6));//static method calling

    }
}
