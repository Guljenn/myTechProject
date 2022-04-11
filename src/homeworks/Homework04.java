package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        //            TASK 1
        /* Pseudocode:
        - Import Scanner Class
        - Create an object of Scanner
        - Print out the question
        - Create the method of the scanner twice
        - Concatenate the equations with String and Print
         */
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        System.out.println("The average of the given 2 numbers is: " + (a + b) / 2);

        // TASK 2
        /*
         - Print out the question
         - Create the method of the scanner twice
         - Concatenate the equation with String and Print
        */

        System.out.println("\nPlease enter 2 numbers");
        System.out.println("The product of the given 2 numbers is: " + userInput.nextInt() * userInput.nextInt());

        // TASK 3
        /*
        - Print out the question
        -Create the variables
        - Create the method of scanner 3 times
        - Concatenate the equation with String and Print
         */


        System.out.println("\nPlease enter 3 numbers");
        System.out.println("\nThe 5 multiplied with 5 is = " + userInput.nextInt() * 5 +
                "\nThe six multiplied with 6 is = " + userInput.nextInt() * 6 +
                "\nThe ten" + "multiplied by 10 is = " + userInput.nextInt() * 10);

        // TASK 4
        /*
        - Print out the question
        - Create the variable
        - Create the method of scanner twice
        - Concatenate the equation with String and print
         */

        System.out.println("\nPlease enter 2 numbers ");
        int remainder1 = userInput.nextInt();
        int remainder2 = userInput.nextInt();
        System.out.println("The remainder of 25 % 8 = " + remainder1 % remainder2);


        // TASK 5
        /*
        - Print out the question
        - Create the method of scanner 5x
        -Concatenate the equation with String and Print
         */

        System.out.println("\nPlease enter 5 numbers ");
        int n1 = userInput.nextInt();
        int n2 = userInput.nextInt();
        int n3 = userInput.nextInt();
        int n4 = userInput.nextInt();
        int n5 = userInput.nextInt();
        userInput.nextLine();
        System.out.println("The average outcome of the given 5 numbers is: " + (n1 + n2 + n3 + n4 + n5) / 5);

        // TASK 6
        /*
        -Print out question
        -Create variable
        -Create the method of Scanner
        -Concatenate the equations with String and Print
         */


        System.out.println("\nPlease enter a number ");
        int num = userInput.nextInt(); // 5
        System.out.println(
                +num + " * 1 = " + (num * 1) + "\n"
                        + num + " * 2 = " + (num * 2) + "\n"
                        + num + " * 3 = " + (num * 3) + "\n"
                        + num + " * 4 = " + (num * 4) + "\n"
                        + num + " * 5 = " + (num * 5) + "\n"
                        + num + " * 6 = " + (num * 6) + "\n"
                        + num + " * 7 = " + (num * 7) + "\n"
                        + num + " * 8 = " + (num * 8) + "\n"
                        + num + " * 9 = " + (num * 9) + "\n"
                        + num + " * 10 = " + (num * 10) + "\n"
        );


        // TASK 7
            /*
            -Print out question
            -Create the method of Scanner
            -Concatenate equation with String and Print
             */

        System.out.println("\nEnter the side of a square ");
        int area = userInput.nextInt();
        System.out.println("Perimeter of the square is = " + area * 4 +
                "\nArea of a square is = " + area * area);
    }
}