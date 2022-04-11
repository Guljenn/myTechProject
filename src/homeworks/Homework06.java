package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
                                                  // TASK 1
        /*
        -Create 2 Strings
        - Convert Strings into int data types
        - Create the equation and print out
         */

        String s1 = "5", s2 = "10";

        int num1Int = Integer.parseInt(s1);
        int num2Int = Integer.parseInt(s2);
        System.out.println("-Sum of 5 and 10 is = " + (num1Int + num2Int) + "\n-Product of " +
                " 5 and 10 is = " + (num1Int * num2Int) + "\n-Division of 5 and 10 is = "
                + (num1Int / num2Int) + "\n-Subtraction of 5 and 10 is = " + (num1Int - num2Int) +
                "\n-Remainder of 5 and 10 is = " + (num1Int % num2Int));

                                                   // TASK 2
        /*
        -Create Strings
        -Convert into int
        -Create the equation and print out
         */
         String num1 = "200", num2 = "-50";

         int firstInt = Integer.parseInt(num1);
         int secondInt = Integer.parseInt(num2);


         System.out.println("\nThe greatest value is = " +  Math.max(firstInt,secondInt) + "\nThe" +
                 "smallest value is = " + Math.min(firstInt,secondInt) + "\nThe average is = " +
                 (firstInt + secondInt)/2 + "\nThe absolute value is = " + Math.abs(firstInt -secondInt));

                                           // TASK 3
        /*
        - Create the variables w/ equations
        - Concatenate and print out

         */

        int a = (int)(24 / .96);
        int b = (int)(168 / .96);
        double c = (30 * 5 * .96);

        System.out.println("\n" + a + " " + "days\n" + b + " " + "days\n" + "$" + c);

                                            // TASK 4
        /*
        -Create the variable
        -Cast float to int
        -Print out
         */

        int save = (int)(1250 / 62.50);
        System.out.println("\n" + save);


                                            // TASK 5
        /*
        -Create variables
        -Cast float to long for first variable
        -Print it out
         */
        long option1 = (long)(14265 / 475.5);
        long option2 = (14265 / 951);

        System.out.println("\nOption 1 will take " + option1 + " months\nOption 2 will take " + option2 + " months");

                                                // TASK 6

        /*
        -Store Scanner
        -Create the object
        -Print out question
        -Create the object scanner 2x
        -Store numbers with double
        -Concatenate the variables, divide, and print
         */
        Scanner userInput = new Scanner(System.in);

        System.out.println("\nEnter 2 numbers ");
        int first = userInput.nextInt(), second = userInput.nextInt();

        double sum = (double)(first) / (second);
        System.out.println(sum);




    }
}