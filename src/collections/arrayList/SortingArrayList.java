package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        //How to sort an array

        int[] numbersArray = {3, 7, 0, 4};

        System.out.println("My array before sort is = " + Arrays.toString(numbersArray));

        Arrays.sort(numbersArray);

        System.out.println("My array after sort is = " + Arrays.toString(numbersArray));


        //how to sort an ArrayList

        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(0);
        numbersList.add(4);

        System.out.println("\nArray list before sorting is = " + numbersList);
        Collections.sort(numbersList);
        System.out.println(("Array list after sorting is  = " + numbersList));
    }
}
