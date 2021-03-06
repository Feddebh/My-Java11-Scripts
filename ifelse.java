package com.example.main;public class ifelse {
    public static void main(String[] args) {
        //conditional statements:
        //if: specifies a block of code to be executed, if a specified condition is true.
        //else: specifies a block of code to be executed, if the same condition is false.
        //else if: specifies a new condition to test, if the first condition is false.
        //switch: specifies many alternative blocks of code to be executed.

        //conditions : Less than (<), greater than (>), equal to (==), etc.

        //EXAMPLE:
        if (20 > 18) { System.out.println("20 is greater than 18.");}

        //We can also test variables:

        int x = 20;
        int y = 18;
        if (x > y) {System.out.println("x is greater than y");}

        //In the example above we use two variables, x and y, to test whether x is greater than y
        // using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18,
        // we print to the screen that "x is greater than y".

        //THE ELSE STATEMENT
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // In the example above, time (20) is greater than 18, so the condition is false.
        // Because of this, we move on to the else condition and print to the screen "Good evening".
        // If the time was less than 18, the program would print "Good day".

        //THE ELSE IF STATEMENT
        // We use the else if statement to specify a NEW CONDITION if the first condition is false.

}
}
