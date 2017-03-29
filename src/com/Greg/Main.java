package com.Greg;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// Cereal Array
public class Main {

    public static void main(String[] args) {

        ArrayList<String> cereals = new ArrayList<String>();
        cereals.add("Special K");
        cereals.add("Captain Crunch");
        cereals.add("Oatmeal");

        // This is where I print original list
        System.out.println(cereals);

        // This is where I remove oatmeal from the list
        cereals.remove("Oatmeal");



        // This is where I create scanner
        Scanner userInput = new Scanner(System.in);

        // This is where I define variable
        String favCer;

        // This is where I determine the user input
        System.out.println("What is your favorite cereal? ");

        // This is where I initialize the variable for user input
        favCer = userInput.next();



        // This is where I add user input to array
        cereals.add(favCer);

        // This is where I add corn flakes to list
        cereals.add("Corn Flakes");

        // This is where I display new list
        System.out.println(cereals);



        // This is where I determine if new list contains special k and display info
        if (cereals.contains("Special K")) {
            System.out.println("You like Special K");   }
        else    {
            System.out.println("You do not like Special K");
        }
    }
}
