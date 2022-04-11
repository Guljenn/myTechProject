package collections.arrayList;

import java.util.ArrayList;
import java.util.List;



public class _02_PracticeRemoveDuplicates {
    public static void main(String[] args) {


        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencils");

        /*
        Find the unique elements in this and print them
        RESULT:
        [Cup, Book, Pen, Pencil]
        */

       List<String> uniques = new ArrayList<>();
        for (String element : objects) {
            if(!uniques.contains(element)) { // if uniques do not contain element then add it to the uniques.
                uniques.add(element);
            }
        }

        System.out.println(uniques);




    }
}
