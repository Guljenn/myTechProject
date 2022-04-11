package homeworks;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

import java.util.Arrays;
import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>TASK1>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);

        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>TASK2>>>>>>>>>>>>>>>>>>>>>>>>>>");


        int[] number = {0, -4, -7, 0, 5, 10, 45};
        boolean isFirstPositiveNumber = false;
        boolean isFirstNegativeNumber = false;
        for (int element : number) {
            if (element > 0 && !isFirstPositiveNumber) {
                isFirstPositiveNumber = true;
                System.out.println("First positive number is : " + element);

            } else if (element < 0 && !isFirstNegativeNumber) {
                isFirstNegativeNumber = true;
                System.out.println("First negative number is : " + element);

            }
            if (isFirstNegativeNumber && isFirstPositiveNumber) break;
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>TASK3>>>>>>>>>>>>>>>>>>>>>>>>>>");
        /*
                    Requirement:
            Write a program to generate 5 random numbers
            between 1 to 10 (1 and 10 are included) and
            store those numbers in an int array.
            Check if int array contains 2 or 3 as elements
            If it contains 2 or 3, then return true
            If it does not contain either 2 or 3, then return
            false
         */
        Random random = new Random();
        int[] randomNumber = new int[5];

        boolean isTwoOrThree = false;

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) (Math.random() * 10 + 1);
            if (randomNumber[i] == 2 || randomNumber[i] == 3) {
                isTwoOrThree = true;
            }
        }
        System.out.println(isTwoOrThree);
        System.out.println(Arrays.toString(randomNumber)); // printed random numbers to check if my code works.


        System.out.println(">>>>>>>>>>>>>>>>>>>>>TASK4>>>>>>>>>>>>>>>>>>>>>>>>>>");
        boolean hasApple = false;
        String[] fruit = {"Strawberry", "banana", "kiwi", "orange", "pineapple"};
        for (String element : fruit) {
            if (element.toLowerCase().contains("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>TASK5>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean hasMatch = false;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    System.out.println(numbers1[i]);
                }
            }
        }
        if (numbers1 != numbers2) {
            System.out.println("There is no matching elements"); // why does this message keep printing?
            // it shouldn't.. Where should I place it?
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>TASK6>>>>>>>>>>>>>>>>>>>>>>>>>>");

                                /*
                                Requirement:
                        Write a program to print duplicated characters in
                        a String, ignore cases
                        Test data 1:
                        String str = ”baNana”;

                               */




    }
}