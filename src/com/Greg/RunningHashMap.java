/*package com.Greg;

import java.util.HashMap;
import java.util.Collections;

public class RunningHashMap {
    public static void main(String[] args) {

        // Completed Array of lakes and lap times
        HashMap<String, Double> lakeCedar = new HashMap<String, Double>();
        lakeCedar.put("Cedar", 45.15);
        lakeCedar.put("Cedar", 43.32);

        // Completed Array of lakes and lap times
        HashMap<String, Double> lakeHarriet = new HashMap<String, Double>();
        lakeHarriet.put("Harriet", 49.34);
        lakeHarriet.put("Harriet", 44.43);
        lakeHarriet.put("Harriet", 46.22);

        // Completed Array of lakes and lap times
        HashMap<String, Double> lakeComo = new HashMap<String, Double>();
        lakeComo.put("Como", 32.11);
        lakeComo.put("Como", 28.14);

// This is where I display ArrayList
        for (String lake : lakeCedar.keySet()) {
            // lake is a key
            System.out.println("Lake: " + lakeCedar);
            System.out.println("Lap time: " + lakeCedar.get(lakeCedar));
        }

        // This is where I display fastest time for first lake
        System.out.println("The fastest time is " + Collections.min(lakeCedar));

        // This is where I display ArrayList
        for (String lake : lakeHarriet.keySet()) {
            // lake is a key
            System.out.println("Lake: " + lakeHarriet);
            System.out.println("Lap time: " + lakeHarriet.get(lakeHarriet));
        }

        // This is where I display fastest time for second lake
        System.out.println("The fastest time is " + Collections.min(lakeHarriet));

        // This is where I display ArrayList
        for (String month : lakeComo.keySet()) {
            // lake is a key
            System.out.println("Lake: " + lakeComo);
            System.out.println("Lap time: " + lakeComo.get(lakeComo));
        }

        // This is where I display fastest time for first lake
        System.out.println("The fastest time is " + Collections.min(lakeComo));
    }
}*/