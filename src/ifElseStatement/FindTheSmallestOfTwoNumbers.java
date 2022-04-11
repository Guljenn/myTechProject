package ifElseStatement;

import java.util.Scanner;

public class FindTheSmallestOfTwoNumbers {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        /*
Write a program that asks user to enter 2 numbers
Find the smallest and print it

EXAMPLE PROGRAM:
Program: Please enter 2 numbers
User: 5 7

Program: 5
 */

        System.out.println("Please enter 2 numbers!");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a < b)System.out.println("The smallest number between " + a + " and " + b + " is : " + a);
        else System.out.println("The smallest number between " + a + " and " + b + " is : " + b);

        System.out.println("End of the program!");

        // int smallestNumber = num1 < num2 ? num1 : num2;  -----> this formula is equivalent to if else 

    }
}
