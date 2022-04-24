package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {
        /*
        create an array to store the below data and print
        1, 5, 7, 9, 10
         */

        // null is not allowed in the arrays as it is a primitive array
        // array allows for duplicates
        System.out.println("................Int Array............................");
        int[] numbers = {1, 5, 7, 9, 10};
        System.out.println(Arrays.toString(numbers));

        System.out.println("................String Array.....................");

        /*
        Create a string and store below data:
        Tokyo, Berlin, Osla, Denver, null, null
        Print the array
        */
            // Array preserves the order
        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};

        System.out.println(Arrays.toString(cities));

        System.out.println(".........List: ArrayList - Vector - LinkedList..........................");

        System.out.println("ArrayList<String> names1 = new ArrayList<>():");
        System.out.println("List<String> names2 = new ArrayList<>();");
        System.out.println("Collection<String> names3 = new ArrayList<>();");
        System.out.println("Iterable<String> names4 = new ArrayList<>();");
        System.out.println("Object name5 = new ArrayList<>();");

        System.out.println("Converting String Array to ArrayList");
        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);
        cities2.add("Tokyo");
        System.out.println(cities2);
        System.out.println(cities2.get(3)); // Denver

        System.out.println("\n............String Vector.................\n");
        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size()); // prints the size --> 6
        names.forEach(System.out::println);  // prints each element
        System.out.println("Name at index of 5 = " + names.get(5));


        System.out.println("\n.................String LinkedList.............\n");
        LinkedList<String> object1 = new LinkedList<>();
       // List<String> object2 = new LinkedList<>(); doesn't have as much methods as LinkedList
        object1.add("Phone");
        object1.add("Computer");
        object1.add("Airpods");
        object1.add("Screen");
        object1.add("Screen");
        object1.add(null);
        object1.add(null);
        object1.add(null);
        object1.add(null);

        System.out.println(object1.getLast());  // last element in the list  -> null
        System.out.println(object1.getFirst()); // first element in the list  -> Phone
        System.out.println(object1.stream().filter(Objects::isNull).count());
        System.out.println(object1.indexOf("Airpods")); // element at given index -> 2




    }
}
