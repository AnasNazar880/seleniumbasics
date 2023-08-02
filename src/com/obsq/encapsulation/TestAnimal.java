package com.obsq.encapsulation;

import com.obsq.interface2.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal1 myAnimal=new Animal1() ;
        myAnimal.setName("Eagle");
        myAnimal.setAverageWeight(2.5);
        myAnimal.setNumberOfLugs(2);
        System.out.println("Name: " +myAnimal.getName());
        System.out.println("AverageWeight : "+myAnimal.getAverageWeight() +"kg");
        System.out.println("number of lugs: "+myAnimal.getNumberOfLugs());









        }
    }

