package projects;

import java.util.Arrays;

public class Project07 {


    // TASK 1 - Find the Greatest and Smallest Using Sort Method
    public static void findTheGreatestWithSort(int[] array, int number) {
        Arrays.sort(array);
        System.out.println(array[number - 1]);
    }

    public static void findTheSmallestWithSort(int[] array, int number) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    //  TASK 2 - Find the Greatest and Smallest
    public static void findTheGreatest(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > max) max = element;
        }
        System.out.println(max);

    }


    public static void findTheSmallest(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) min = element;

        }
        System.out.println(min);
    }
    // TASK 3 - Find The Second Smallest and Second Greatest With Sort

    public static void findTheSecondGreatestWithSort(int[] array, int number) {
        Arrays.sort(array);
        System.out.println(array[number - 2]);
    }

    public static void findTheSecondSmallestWithSort(int[] array, int number) {
        Arrays.sort(array);
        System.out.println(array[1]);
    }
    // TASK 4 -  Find The Second Greatest and Smallest

    public static void findTheSecondGreatest(int[] array, int number) {
        int maxValue = Integer.MIN_VALUE;
        int maxValue2 = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > maxValue2 && element != maxValue) maxValue2 = element;
        }
        System.out.println(maxValue2);
    }

    public static void findTheSecondSmallest(int[] array, int number) {
        int minValue = Integer.MAX_VALUE;
        int minValue2 = Integer.MIN_VALUE;
        for (int element : array) {
            if (element < minValue2 && element != minValue) minValue2 = element;
        }
        System.out.println(minValue2); ;
    }


    // TASK 5 - Find Duplicated Elements in an Array
    public static void findDuplicatedElements(String[] array, String strSize) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i].equals(array[j])) {
                }
        }
        System.out.println(strSize); ;

    }

    // TASK 6 - Find Duplicated Elements in Array

    public static void findMostCommonElement(String[] arr) {

        String mostCountedWord = "";
        int mostCountedTimes = 0;

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];    // why did we have to create a String "word" ?
            int countOfWord = 0;

            for (String w : arr) {
                if (word.equals(w)) countOfWord++;  // why can't we just use arr.equals(w) here?
            }
            if (countOfWord > mostCountedTimes) {
                mostCountedWord = word;
                mostCountedTimes = countOfWord;
            }
        }
        System.out.println(mostCountedWord);







    }


}