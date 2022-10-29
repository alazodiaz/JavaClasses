package com.java.class18;

public class Horse extends Animal {


    public Horse(String name, String breed, int age, double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }

    void printInfo(){
        System.out.println("name"+name+"Breed"+breed+"Age"+age+"Weight"+weight);
    }

    public static void main(String[] args) {
        Horse horseObeject=new Horse("Spirit", "Stallion",20,400);
        horseObeject.printInfo();
    }


}
