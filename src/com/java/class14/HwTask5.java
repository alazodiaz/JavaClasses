package com.java.class14;

public class HwTask5 {
    public static void main(String[] args) {

       String str="dad";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("he String is not Palindrome");
        }
    }
}
