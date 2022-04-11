package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToEachOther {
    public static void main(String[] args) {
        /*
        ArrayList - LinkedList
        LinkedList - ArrayList
        Vector - to ArrayList
        ArrayList - Vector
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println("The ArrayList is = " + numbers);

        System.out.println("\nConverting ArrayList To Linked List");

        LinkedList<Integer> numbers2 = new LinkedList<>(numbers);
        System.out.println("The LinkedList is = " + numbers2);

        System.out.println("\nConverting LinkedList to an ArrayList");
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);


        String[] namesArr = {"Kaly", "Torrie", "Taylor"};
        Vector<String> names = new Vector<>(Arrays.asList(namesArr));

    }
}
