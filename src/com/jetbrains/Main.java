package com.jetbrains;

import java.lang.ArrayIndexOutOfBoundsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String knowAnotherStudent = "";

        System.out.println("Welcome to our Java Class! ");

        do {
            System.out.println("Choose a number between 1 and 10 to hear about a particular student: ");

            int userInput = getUser();

            if (userInput < 1 || userInput > 10) {
                knowAnotherStudent="yes";
                continue;
            }

            String name = getName(userInput);

            if (name.equals("")) {
                knowAnotherStudent="yes";
                continue;
            }

            System.out.println("The student's name is " + name + ".");

            System.out.println("What would you like to know about " + getName(userInput) + "?");
            System.out.println("(Enter either hometown or favoritefood)");

            String answer = scnr.next();

            if (answer.equals("hometown")) {
                System.out.println(getName(userInput) + " was born in " + getHometown(userInput) + ".");
            }
            else if (answer.equals("favoritefood")){
                System.out.println(getName(userInput) + " s favorite food is " + getFood(userInput) + ".");
            }

            System.out.println("Would you like to know another student? ");
            knowAnotherStudent = scnr.next();

        } while (knowAnotherStudent.equals("yes"));

        System.out.println("Thank you!");

    }

    private static int getUser() {
        int userNum = 0;

        try {
            Scanner scnr = new Scanner(System.in);
            userNum = scnr.nextInt();
            } catch (InputMismatchException e) {
            System.out.println("Error: This program only accepts integers between 1 and 10.");
        }

        return userNum;
    }

    public static String getName(int userInput) {

        final int NUM_ELEMENTS = 10;
        String name = "";

        String[] studentNames = new String[NUM_ELEMENTS];

        studentNames[0] = "Aaron";
        studentNames[1] = "Jordy";
        studentNames[2] = "Clay";
        studentNames[3] = "Randall";
        studentNames[4] = "Brett";
        studentNames[5] = "Reggie";
        studentNames[6] = "Charles";
        studentNames[7] = "Donald";
        studentNames[8] = "Greg";
        studentNames[9] = "Antonio";

        try {
            name = studentNames[userInput];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Student does not exist. Please try again.");
        }

        return name;
    }

    public static String getHometown(int userInput) {

        final int NUM_ELEMENTS = 10;
        String hometown = "";

        String[] studentHometown = new String[NUM_ELEMENTS];

           studentHometown[0] = "Chico";
           studentHometown[1] = "Manhattan";
           studentHometown[2] = "Northridge";
           studentHometown[3] = "Maryville";
           studentHometown[4] = "Gulfport";
           studentHometown[5] = "Chattanooga";
           studentHometown[6] = "Fremont";
           studentHometown[7] = "Houston";
           studentHometown[8] = "Kalamazoo";
           studentHometown[9] = "Miami";

           hometown = studentHometown[userInput];


        return hometown;
    }

    public static String getFood(int userInput) {

        final int NUM_ELEMENTS = 10;
        String favoriteFood = "";

        String[] studentFood = new String[NUM_ELEMENTS];

        studentFood[0] = "steak";
        studentFood[1] = "fries";
        studentFood[2] = "tuna pasta casserole";
        studentFood[3] = "hot dogs";
        studentFood[4] = "onion rings";
        studentFood[5] = "tacos";
        studentFood[6] = "fried chicken";
        studentFood[7] = "pasta";
        studentFood[8] = "hamburger";
        studentFood[9] = "meatloaf";

        favoriteFood = studentFood[userInput];

        return favoriteFood;
    }
}
