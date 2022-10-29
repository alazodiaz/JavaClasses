package com.java.class14;

public class HwTask2 {
   /*
   Create a string that should be a combination of letters,numbers, and special characters.
   Find out how many Alphanumeric (abd AZ 264) characters are there in the String.
    */
    public static void main(String[] args) {
        String str="dsfkjAJSKA1263#%6";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str = " + str);
        System.out.println(str.length());

    }
}
