package arrays;

import java.util.Arrays;

public class _03_Practice_IntArray {
    public static void main(String[] args) {
        /*
        Create an int array and store below data
        -3
            -7
            0
            2
            0
            7
            7
            10
            2
            15

Print the array with message "Array not sorted = "
Print the sorted array with message "Array sorted = "
         */

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

        //count positive numbers negative and 0 numbers

        int positives = 0, negatives = 0, zeros = 0;

        for (int number : numbers) {
            if (number > 0) positives++;
            else if (number < 0) negatives++;
            else zeros++;
        }

        System.out.println("Positives = " + positives);
        System.out.println("Negatives = " + negatives);
        System.out.println("Zeros = " + zeros);

        System.out.println("\n-------TASK-2 - another approach-------\n");
        int pos = 0, neg = 0;

        for (int number : numbers) {
            if (number > 0) pos++;
            else if (number < 0) neg++;
        }

        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length - pos - neg));

        // COUNT HOW MANY EVEN AND ODD NUMBERS
        int countE = 0, countO = 0;
        for (int element : numbers) {
            if (element % 2 == 0) countE++;
            else countO++;

        }
        System.out.println("Evens = " + countE);
        System.out.println("Odds = " + countO);

         /*
        EXTRA PRACTICE
        Numbers that are more than 7 -> 2
        Numbers that can be divided by 5 -> 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this
        Count how many numbers are 2 digits
         */


    }
}
