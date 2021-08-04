package com.example.main;

public class booleans {
    public static void main(String[] args) {

        //A boolean type is declared with the boolean keyword and can only take the values true or false:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        //boolean expressions examples:

        //greater than (>):
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        //equal (==)
        int z = 10;
        System.out.println(z == 10); // returns true, because the value of z is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15
    }
}
