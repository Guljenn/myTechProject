package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        // TASK 1
        /*
        - Import Scanner
        - Create an Object
        - Ask user Question and Print
        - Create the method of the Scanner 3x
        - Concatenate variables with String and print

         */

        // TASK 1
        Scanner collect = new Scanner(System.in);


        System.out.println("Please enter 3 numbers ");
        int a = collect.nextInt();
        int b = collect.nextInt();
        int c = collect.nextInt();
        System.out.println("Max Value = " + Math.max(Math.max(a, b), c) + "\nMin" +
                "Min Value = " + Math.min(Math.min(a, b), c));


                                                  // TASK 2
        /*
        -Ask user question
        -Create the object scanner 5x
        -Concatenate variables with String and print
        */


        System.out.println("Please enter 5 numbers ");
        int num1 = collect.nextInt(), num2 = collect.nextInt(), num3 = collect.nextInt(), num4 = collect.nextInt(), num5 = collect.nextInt();

       // System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(num1,num2),num3),num4),num5));
      //  System.out.println("Min value = " + Math.min(Math.min(Math.min(Math.min(num1, num2),num3),num4),num5));
        Math.max(num1, num2);
        Math.max(num3,num4);
        //num5;
        Math.max(Math.max(num1, num2),Math.max(num3,num4));
        Math.max(Math.max(Math.max(num1, num2),Math.max(num3,num4)),num5);



        // TASK 3
        /*
        - Ask User the question using println()
        -Create the object scanner 2x
        -Concatenate variables with string and print
         */

        System.out.println("\nPlease enter 2 numbers");
        int absNum1 = collect.nextInt();
        int absNum2 = collect.nextInt();

        System.out.println("\nThe differences between numbers is = " + (Math.abs(absNum1 - absNum2)));

        // TASK 4


        int rndNum1 = (int) (Math.random() * 51) + 50;
        int rndNum2 = (int) (Math.random() * 51) + 50;
        int rndNum3 = (int) (Math.random() * 51) + 50;
        int sumOfRndNum = rndNum1 + rndNum2 + rndNum3;
        System.out.println("Number 1 = " + rndNum1 + "\nNumber 2 = " + rndNum2
                + "\nNumber 3 = " + rndNum3 + "\nThe sum of numbers is = " + sumOfRndNum);

        // TASK 5

        /*
        -Create the variables
        -Concatenate variables with equation and print string
         */

        double Alex = 125;
        double Mike = 220;
        System.out.println("Alex's money: $" + (Alex - 25.5) + "\nMike's money: $" + (Mike + 25.5));

        // TASK 6
        /*
        -Create Variables
        -Create Equation and Print
         */
        int bike = 390;
        double perDay = 15.60; //15
        System.out.println((int)(bike / perDay));

    }
}