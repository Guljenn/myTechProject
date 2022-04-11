package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /* Learning how to sort an array of numbers
        byte, short, int, long, float, double

        We will sort them ascending order (Lowest to highest
         */
        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};
        System.out.println("My arrays is = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

                            // SORTING CHARACTERS

        char[] characters = {'A', 'b', 'z', 'H'};
        System.out.println(Arrays.toString(characters));
        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));

        // SORTING WORDS

        String [] names = {"Adam", "Alex", "tom", "ally", "Adele", "terry", "Josh"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
