package com.java.class22;

public class AnimalTester {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
        cat.eat();

        //TYPE CASTING
        Animal animal=new Panda(); //Upcasting
        // Panda panda=new Aninmal(); //down-casting to not get error Cat cat=(Cat) new Animal();
        Animal animal1=new Cat();
        Animal [] animals={new Cat(), new Panda()};
    }
}
