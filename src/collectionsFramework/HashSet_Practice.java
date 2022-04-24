package collectionsFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet_Practice {
    public static void main(String[] args) {
        /*
        How to create a HashSet
         */
        HashSet<Integer> numbers = new HashSet<>();
        //Set<Integer> numbers2 = new HashSet<>(); looses some functionalities

        numbers.add(5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(55);
        numbers.add(null);
        numbers.add(3);
        numbers.add(-5);
        //numbers.add(55); does not allow duplicates
        System.out.println(numbers);
    }
}
