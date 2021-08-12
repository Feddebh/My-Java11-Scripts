package com.example.main;

public class Switch {
    public static void main(String[] args) {
        //We use the switch statement to select one of many code blocks to be executed.
        //The switch expression is evaluated ONCE.
        //The value of the expression is compared with the values of each case.
        //If there is a match, the associated block of code is executed.

        //The example below uses the weekday number to calculate the weekday name:
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are 7 days in the week.");
                
        }
        //The default keyword specifies some code to run if there is no case match:
        }
    }

