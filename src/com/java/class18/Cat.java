package com.java.class18;

public class Cat {

   private String name;

    private String breed;

   private int age;

    private double weight;

   /* Cat(){
        System.out.println(String);
    }

    public static void main(String[] args) {
        Cat catObject=new Cat();
        catObject.name="Laila majnu";
        catObject.breed="Persian";
        catObject.age=5;
        catObject.weight=5; */

    public Cat (String catName, String catBreed, int catAge, double catWeight){
        name=catName;
        breed=catBreed;
        age=catAge;
        weight=catWeight;
    }
    public void printInfo() {
        System.out.println("Name"+name+"Breed"+ breed+"Age"+age+"weight"+weight);
    }


    }

