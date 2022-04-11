package homeworks;

import java.util.*;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<<<<<<<<TASK1>>>>>>>>>>>>>>>>>>>>>>>>");
        /*
                        Requirement:
                Write a program to find the first duplicated number in an int array
                It should print “There is no duplicates” if there are no duplicate
                elements.
                NOTE: Make your code dynamic that works for any given int array.
                Test data 1:
                int[] numbers =


        /*
        1. Create an int Array
        2. Create 2 loops to compare elements
        3. Compare each element with every other element in the array
        4. Create an attempt container to track first attempt
        5. Create boolean container
        6. If element is = to array, print
        7. if element is not = to array, "There is no duplicate element"
         */


        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        int attempt = 0;
        boolean isFirstDuplicate = false;

        for (int i = 0; i < numbers.length-1; i++){
          for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    attempt +=1;
                    System.out.println(numbers[i]);
                    isFirstDuplicate = true;

                }
            }
            if(attempt > 0) break;
        }
        if(!isFirstDuplicate) System.out.println("There is no duplicates");


        System.out.println("<<<<<<<<<<<<<<<<<TASK2>>>>>>>>>>>>>>>>>>>>>>>>");
            /*
            Requirement:
            Write a program to find the first duplicated String in a String array, ignore
            cases. It should print “There is no duplicates” if there are no duplicate
            elements.
            NOTE: Make your code dynamic that works for any given String array
             */
        /*
        pseudocode:
        1. Create a String array
        2. Create 2 loops to iterate through each element and compare
        3. Create a boolean flag
        4. Create attempt container to check first attempt
        5. Print if there are no duplicates
         */
        String[] objects = {"Z", "abc",  "z", "123", "#" };
        boolean isWordDuplicate = false;
        int attempts = 0;
        for(int i = 0; i < objects.length; i++){
            for(int j = i + 1; j < objects.length; j++){
                if(objects[i].toLowerCase().equals(objects[j])){
                    attempts += 1;
                    System.out.println(objects[i]);
                    isWordDuplicate = true;

                }
            }
            if(attempts > 0) break;
        }
        if(!isWordDuplicate) System.out.println("There are no duplicates");

        System.out.println("<<<<<<<<<<<<<<<<<TASK3>>>>>>>>>>>>>>>>>>>>>>>>");

        /*
        Requirement:
        Write a program to find the all duplicates in an int array. It
        should print “There is no duplicates” if there are no
        duplicate elements.
        NOTE: Make your code dynamic that works for any given
        int array
         */

        int[] number = {0, 3, 2, 1, 5, 7, 10};
        /*
        pseudocode:
        1. Create 2 loops to compare elements
        2. Compare each element with every other element in the array
        3. If there are duplicates, print
        4. if there are no duplicates, print "There is no duplicates"
         */
        boolean isDuplicated = false;
        for (int i = 0; i < number.length; i++) {  // creating the first loop
            for (int j = i + 1; j < number.length; j++) {  //creating the second loop to compare//
                // assuming that i is 0, j+1 starts from index of 1
                if (number[i] == number[j]) { // comparing all elements
                    System.out.println(number[i]);
                    isDuplicated = true;

                }
            }
        }
        if (!isDuplicated) {
            System.out.println("There are no duplicates");
        }
        System.out.println("<<<<<<<<<<<<<<<<<TASK4>>>>>>>>>>>>>>>>>>>>>>>>");

        /*
        Requirement:
        Write a program to find the all duplicates in a String array,
        ignore cases. It should print “There is no duplicates” if
        there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given
        String array.
         */

        String[] words = {"apple", "kiwi", "strawberry", "pineapple", "Apple", "KIWI", "Orange", "orange", "apple"};
        boolean duplicates = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {

                    System.out.println(words[i]);
                    duplicates = true;
                }
            }
        }
        if (!duplicates) {
            System.out.println("There are no duplicates");
        }

        // This code works with the given variables but when I put in  {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”,
        //“java”}, it doesn't. WHY???? I left it with my variables because I want to understand why it's not working.

        System.out.println("<<<<<<<<<<<<<<<<<TASK5>>>>>>>>>>>>>>>>>>>>>>>>");
                    /*
                    Requirement:
                    Write a program to reverse elements in an array, then
                    print array.
                    NOTE: Make your code dynamic that works for any
                    given array.
                     */
//
//        String[] objects = {"Foo", "Bar", "Zoo"};
//        for(int i = objects.length -1; i >= 0; i--){
//            System.out.print(objects[i] + ' ');
//
//        }

        String[] objects1 = {"Foo", "Bar", "Zoo"};


        for (int i = 0; i < objects1.length / 2; i++) {
           String temp = objects1[i];
            objects1[i] = objects1[objects1.length - i - 1];
            objects[objects1.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(objects1));

        // SO CONFUSING!!


        System.out.println("<<<<<<<<<<<<<<<<<TASK6>>>>>>>>>>>>>>>>>>>>>>>>");

        /*
        Requirement:
        Write a program to reverse each word in a given String
        NOTE: Make your code dynamic that works for any
        given String
         */

        /*
        pseudocode:
        1. Create a String
        2. Create a String Array and convert to words with split()
        3. Create an Empty container to store sentence
        4. Create For each loop to store variables
        5. Create for i loop to reverse string

         */
        String str = "Java is not that fun!";
        String[] sentence = str.split(" ");//splitting into  words
        String reversed ="";
        for (String w : sentence) {//storing each variable into task
            String reversedW ="";
            for (int i = w.length() - 1; i >= 0; i--) {//reverse string
                reversed +=w.charAt(i);
            }
            reversed +=reversedW + " ";//avaJ is nuf // yadoT si a nuf yad
        }
        System.out.println(reversed);




    }

}






