package com.java.class18;

public class Student {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */

    String name;
    double sub1;
    double sub2;
    double sub3;

    Student(String studentName, double sub1, double sub2, double sub3) {

    }

    void calculatePrintAvgGrade() {
      //  System.out.println(name+" "(sub1+sub2+sub3)/3);
    }

    public static void main(String[] args) {
       new Student("Sabah", 99, 98, 97.5).calculatePrintAvgGrade();
    }
}
