/*
*Himansu Yapa
*CST338
*3/2/2026
*/

import java.util.HashMap;

public class Driver {

    public static void main(String[] args) {

        // Create an Imp
        HashMap<String, Integer> impItems = new HashMap<>();
        // add items here
        Imp imp = new Imp(10, 10, 20, impItems);

        // Create a Kobold
        HashMap<String, Integer> koboldItems = new HashMap<>();
        // add items here
        Kobold kobold = new Kobold(8, 10, 15, koboldItems);

        // Print both monsters
        System.out.println(imp.toString());
        System.out.println(kobold.toString());
    }
}