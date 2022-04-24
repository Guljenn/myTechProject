package collectionsFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();  // Create ArrayList
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(2);

        TreeSet<Integer> uniques = new TreeSet<>(numbers);  // Convert to TreeSet to sort them and remove duplicates
        System.out.println(uniques);  // 3, 5, 7

        ArrayList<Integer> uniquesList = new ArrayList<>(uniques); // Convert back to ArrayList to get index of second greatest
        System.out.println("The second greatest number is " + uniquesList.get(uniquesList.size()-2));  // 5
        System.out.println("The second smallest number is " + uniquesList.get(1));   // 3
    }
}
