package com.obsq.inheritanceinterface;

public class TestInterfaceInheritance implements Printable,Showable {
    @Override
    public void print() {
        System.out.println("print my name");
    }


    @Override
    public void show() {
        System.out.println("show your id card");
    }

    public static void main(String[] args) {
       TestInterfaceInheritance obj=new TestInterfaceInheritance();
       obj.print();
       obj.show();
    }
}
