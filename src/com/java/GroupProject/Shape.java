package com.java.GroupProject;

public interface Shape {
    void input();

    void area();
}
class Circle implements Shape {
    int r = 0;
    double pi = 3.14, ar = 0;

    @Override
    public void input() {
        r = 5;
    }

    @Override
    public void area() {
        ar = pi * r * r;
        System.out.println("Area of circle" + ar);
    }
}
class Square extends Circle {
    int l=0, w=0;

    double ar;

    public void input() {
        super.input();
        l=10;
        w=10;
    }
    public void area() {
        super.area();
        ar=l*w;
        System.out.println("Area of a square"+ar);
    }
}
