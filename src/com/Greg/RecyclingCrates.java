package com.Greg;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RecyclingCrates {

    public static void main(String[] args) {

        // This is where I create scanner
        Scanner userInput = new Scanner(System.in);

        // This is where I define variables
        int h0;
        int h1;
        int h2;
        int h3;
        int h4;
        int h5;
        int h6;
        int h7;

        // This is where I determine the user input
        System.out.println("How many crates at this house? (0) ");

        // This is where I initialize the variable for user input
        h0 = userInput.nextInt();


        // This is where I determine the user input
        System.out.println("How many crates at this house? (1) ");

        // This is where I initialize the variable for user input
        h1 = userInput.nextInt();


        // This is where I determine the user input
        System.out.println("How many crates at this house? (2) ");

        // This is where I initialize the variable for user input
        h2 = userInput.nextInt();


        // This is where I determine the user input
        System.out.println("How many crates at this house? (3) ");

        // This is where I initialize the variable for user input
        h3 = userInput.nextInt();


        // This is where I determine the user input
        System.out.println("How many crates at this house? (4) ");

        // This is where I initialize the variable for user input
        h4 = userInput.nextInt();


        // This is where I determine the user input
        System.out.println("How many crates at this house? (5) ");

        // This is where I initialize the variable for user input
        h5 = userInput.nextInt();


        // This is where I determine the user input
        System.out.println("How many crates at this house? (6) ");

        // This is where I initialize the variable for user input
        h6 = userInput.nextInt();


        // This is where I determine the user input
        System.out.println("How many crates at this house? (7) ");

        // This is where I initialize the variable for user input
        h7 = userInput.nextInt();



        // This is where I create an array for my items
        ArrayList<Integer> crateNum = new ArrayList<Integer>();
        crateNum.add(h0);
        crateNum.add(h1);
        crateNum.add(h2);
        crateNum.add(h3);
        crateNum.add(h4);
        crateNum.add(h5);
        crateNum.add(h6);
        crateNum.add(h7);

        // This is where I determine total crate number
        int crateTotal = h0 + h1 + h2 + h3 + h4 + h5 + h6 + h7;

        // This is where I display total crate number
        System.out.println("The total crate number is " + crateTotal);

        // This is where I determine largest crate number
        int bigNum;

        // This is where I display largest crate number
        System.out.println("The largest crate number is " + Collections.max(crateNum));

        // This is where I determine smallest crate number
        int lilNum;

        // This is where I display smallest crate number
        System.out.println("The smallest crate number is " + Collections.min(crateNum));
    }
}
