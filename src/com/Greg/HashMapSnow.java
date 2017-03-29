package com.Greg;

import java.util.HashMap;

public class HashMapSnow {
    public static double main(String[] args) {

        // Completed Array of snowfall amounts and month keys
        HashMap<String, Integer> snowfall = new HashMap<String, Integer>();
        snowfall.put("January", 3);
        snowfall.put("February", 10);
        snowfall.put("March", 3);
        snowfall.put("April", 10);
        snowfall.put("May", 3);
        snowfall.put("June", 10);
        snowfall.put("July", 3);
        snowfall.put("August", 10);
        snowfall.put("September", 3);
        snowfall.put("October", 10);
        snowfall.put("November", 3);
        snowfall.put("December", 10);

        // This is where I display ArrayList
        for (String month : snowfall.keySet()) {
            // month is a key
            System.out.println("Month: " + month);
            System.out.println("Snowfall inches: " + snowfall.get(month));
        }
        // This is where I define variable for snowfall total
        double sum = 0;
        double month;

        for(month = 1; month < snowfall.size(); month += 1)
            sum += snowfall.get(month);
        return sum;

        // This is where I add up all the snowfall

    }
}