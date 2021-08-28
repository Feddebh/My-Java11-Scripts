package com.example.main;

public class Loops {
    public static void main(String[] args) {
        int i= 0;
        while (i < 5){
            System.out.println(i); i++;
        }

        //for loop
        //When you know exactly how many times you want to loop through
        // a block of code, use the for loop instead of a while loop:
        for (int a = 0; a < 5; a++) {
            System.out.println(a);
        }

        //The forEach loop

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String x : cars) {
            System.out.println(x);
        }
    }
}
