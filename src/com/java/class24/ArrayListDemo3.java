package com.java.class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        //how to store characters in arrayList
        //ArrayList<Character> chars=new ArrayList<>(new ArrayList<>(Arrays.asList('E','F')));

        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(12.5F);
        floats.add(12.5f);
        System.out.println(floats);

    }
}
