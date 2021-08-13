package com.example.main;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        // The ArrayList class is a resizable array.
        // Elements can be added and removed from an ArrayList whenever you want.
        // The syntax is also slightly different:
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");

        // To modify an element, use the set() method and refer to the index number:

        System.out.println(fruits.get(3));
        fruits.set(0, "Strawberry");

        // To remove an element, use the remove() method and refer to the index number:

        System.out.println(fruits.get(0));
        fruits.remove(2);

        System.out.println(fruits);

        //To remove all the elements in the ArrayList, use the clear() method:

        // fruits.clear();

        // To find out how many elements an ArrayList have, use the .size method:

        System.out.println(fruits.size());

        fruits.forEach(fruit -> System.out.println(fruit));

        //Integer ArrayList

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(40);

        myNumbers.forEach(number -> System.out.println(number));

        //Sort an ArrayList
        // Another useful class in the java.util package is the Collections class, which include the sort()
        // method for sorting lists alphabetically or numerically:
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Fiat");
        cars.add("Peugeot");
        cars.add("Renault");
        cars.add("Volkswagen");
        Collections.sort(cars); //sort elements

        cars.forEach(car -> System.out.println(car));

    }
}
