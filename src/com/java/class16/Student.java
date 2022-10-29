package com.java.class16;

public class Student {

    //1 Usage
    String name;

    String id;

    //1 usage
    static int numberOfStudents;


    public static void main(String[] args) {

        Student roman=new Student();
        roman.id="1";
        roman.numberOfStudents++;

        Student sonamKapor= new Student();
        roman.id="2";
        roman.name="Sonam";
        roman.numberOfStudents++;

        System.out.println(numberOfStudents);
        System.out.println(roman.numberOfStudents);

    }
}
