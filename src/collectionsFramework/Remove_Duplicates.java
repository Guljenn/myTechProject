package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        /*
        Create an arrayList and store below elements
        Computer
        Phone
        Mouse
        Mouse
        Phone
        Pen
        From above List, remove all duplicates and print the unique elements
        EXPECTED RESULTS:
        [Computer, Phone, Mouse, Pen]
         */

        System.out.println("'\n --------First way - not preferred-------------\n");

        // First create an array list to store the objects

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println(objects);  // List before removing elements

        // Create an empty list to store unique values
        ArrayList<String> uniques = new ArrayList<>();

        for(String object : objects)
            if(!uniques.contains(object)) uniques.add(object);

        System.out.println(uniques); // List after removing elements

        System.out.println("\n...............Second Way - using collections..............\n");
        //Treeset -> Computer, Mouse, Pen, Phone
        //HashSet -> no prediction
        //LinkedHashet -> it will perserve the order

        LinkedHashSet<String> myUniques = new LinkedHashSet<>(objects);
        System.out.println(myUniques);





    }
}
