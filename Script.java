//Variables are containers for storing data values.
//In Java, there are different types of variables, for example:
//STRING - Stores text, such as "Hello. ". String values are surrounded by quotes.
//INT - Stores integers (whole numbers), w/o decimals, such as 123 or -123.
//BOOLEAN - Stores values with two states: true or false.

package com.example.main;

public class Script {
    public static void main(String[] args) {
        //STRING
        String name = "John";
        System.out.println(name);

        //INT
        int myNum;
        myNum = 15;
        System.out.println(myNum);

        //BOOLEAN
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }
}

