package com.java.class25;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;
        //boxing or manual conversion from primitive to wrapper type
        //Integer wrappedNum=Integer.valueof(num);
        //Now called AutoBoxing or automatic conversion of a primitive to a wrapper type

        Integer wrappedNum=num;
        System.out.println(wrappedNum);
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        //unboxing convverting a wrapper type to a corresponding primitive type
        //int num2=wrappedNum.intValue();
        //Auto unboxing or automatic conversion of a wrapper type to a primitive type
        // int num2=wrappedNum;

    }
}
