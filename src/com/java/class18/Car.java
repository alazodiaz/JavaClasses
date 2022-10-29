package com.java.class18;

public class Car {
    // Common class has many names like parent class, super class, base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
// if a field or method has private access modifier in a parent class, child classes can't use it.
    private String engineType;
    void printCarDetails() {
        System.out.println("Model " + model + " Make " + make + " Color" + color);
    }
}

 class BMW extends Car{
    double engineCC;

    }


class  Tesla {

}

 class Toyota {
     double engineCC;
 }

 class CarTester {
     public static void main(String[] args) {
         BMW bmw = new BMW();
         bmw.make = "BMW";
         bmw.color = "Black";
         bmw.model = "x8";
         bmw.engineCC = 200;
         bmw.printCarDetails();

     }


 }

