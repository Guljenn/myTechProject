package loops.whileLoops;

import utilities.ScannerHelper;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter a number. Find how many attempts
        user enters to find your number. This is hard coded.
         */

//        int userNumber = ScannerHelper.getNumberFromUser();
//
//        int myNumber = 7;
//
//        while (myNumber != userNumber){
//            userNumber = ScannerHelper.getNumberFromUser();
//
//        }
//        System.out.println("You guessed it right!");

        // find the number using random number generator
//        Random random = new Random();
//        int randomNumber = random.nextInt(10) + 1;
//        System.out.println("The random number is = " + randomNumber);
//
//        int userNumber = ScannerHelper.getNumberFromUser();
//
//
//
//        while(randomNumber != userNumber) {
//            userNumber = ScannerHelper.getNumberFromUser();
//
//        }
//        System.out.println("You guessed the number ");
        int myNumber = 7;
        System.out.println("The random number is = " + myNumber );
        Random random = new Random();
        int userNumber = random.nextInt(10) + 1;
        int attempt = 1;

        while(userNumber != myNumber){
          //  System.out.println("The random number guessed by user is " + userNumber);
            userNumber = random.nextInt(10) + 1;
            attempt++;

        }
        System.out.println("You guessed it!");
        System.out.println("After " + attempt + " attempts, you guessed it right!");

    }
}
