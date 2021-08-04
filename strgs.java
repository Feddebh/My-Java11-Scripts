//String methods

package com.example.main;

public class strgs {
    public static void main(String[] args) {

        //length() method
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //toUpperCase() and toLowerCase():
        String txtTwo= "Hello world";
        System.out.println(txtTwo.toUpperCase());
        System.out.println(txtTwo.toLowerCase());

        //String concatenation:
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        //OR we can use the Concat() method:
        String firstNamet = "John ";
        String lastNamet = "Doe";
        System.out.println(firstNamet.concat(lastNamet));



    }
}
