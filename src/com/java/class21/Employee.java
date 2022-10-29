package com.java.class21;

public class Employee {
    void calculateSalary(){
        System.out.println(40*40*52+2000);
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary() {
        super.calculateSalary();
    }
}
