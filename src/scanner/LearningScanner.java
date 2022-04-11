package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String [] args){

        // I will use Scanner class for creating my object
        // I will use the object for reading the data

        Scanner scanner = new Scanner (System.in); // We created a scanner object for using the method

        System.out.println("Please put your first name"); //this is what I want the user to put
        String firstName = scanner.next();  // Storing the first name form user
        System.out.println("The name user put = " + firstName); //Printing the object/variable

        System.out.println("Please put your last name:");
        String lastName = scanner.next();



        System.out.println("Please enter 4 numbers ");

        int num1 = scanner.nextInt(),num2 = scanner.nextInt(),num3 = scanner.nextInt(), num4 = scanner.nextInt();

        Math.max(num1,num2);
        Math.max(num3,num4);
        Math.max(Math.max(num1,num2),Math.max(num3,num4));
        System.out.println("The biggest number is: " + Math.max(Math.max(num1,num2),Math.max(num3,num4)));


        Math.min(num1, num2);
        Math.min(num3, num4);
        Math.min(Math.min(num1, num2),Math.min(num3, num4));

        System.out.println("The smallest number you have entered is: " + Math.min(Math.min(num1, num2),Math.min(num3, num4)));







    }
}
