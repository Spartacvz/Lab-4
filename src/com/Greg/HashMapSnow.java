package com.Greg;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSnow {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);


    public static void main(String[] args) {

// Completed Array of snowfall amounts and month keys
        HashMap<String, Integer> snowfall = new HashMap();
        snowfall.put("January", 3);
        snowfall.put("February", 10);
//        snowfall.put("March", 3);
//        snowfall.put("April", 10);
//        snowfall.put("May", 3);
//        snowfall.put("June", 10);
//        snowfall.put("July", 3);
//        snowfall.put("August", 10);
//        snowfall.put("September", 3);
//        snowfall.put("October", 10);
//        snowfall.put("November", 3);
//        snowfall.put("December", 10);


        // todo add a loop to ask user for more data until they are done.
        // todo add code to check if month is already in HashMap, ask user if they want to overwrite or not?

        System.out.println("Enter name of month");
        String userMonth = stringScanner.nextLine();

        System.out.println("You entered " + userMonth);

        if (snowfall.containsKey(userMonth)) {
            System.out.println("The hashmap already has data for this month");

            // use scanner to ask user to overwrite or ignore?
            System.out.println("Do you want to overwrite? Enter 'yes' to overwrite");
            String overwrite = stringScanner.nextLine();
            if (overwrite.equals("yes")) {
                System.out.println("How much snow in " + userMonth + "?");
                int userSnow = numberScanner.nextInt();
                // Add this data to the HashMap.
                snowfall.put(userMonth, userSnow);
            }

        }

        else {

            // Ask user for snow on that month

            System.out.println("How much snow in " + userMonth + "?");
            int userSnow = numberScanner.nextInt();
            // Add this data to the HashMap.

            snowfall.put(userMonth, userSnow);
        }


// This is where I display ArrayList
        for (String month : snowfall.keySet()) {
// month is a key
            System.out.println("Month: " + month);
            System.out.println("Snowfall inches: " + snowfall.get(month));
        }
// This is where I define variable for snowfall total
        double sum = 0;
        //double month;

        for (String month : snowfall.keySet()) {
            sum += snowfall.get(month);
        }
        System.out.println(sum);

// This is where I add up all the snowfall

    }
}
