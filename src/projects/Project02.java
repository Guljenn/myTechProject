package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {


                                        // TASK 1
        /*
        -Import Scanner Class
        -Print Question
        -Create the object of scanner 3x
        -Concatenate with String and Print
         */
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int firstNum = userInput.nextInt();
        int secondNum = userInput.nextInt();
        int thirdNum = userInput.nextInt();
        System.out.println("The product of the numbers entered is = " + firstNum * secondNum * thirdNum);

                                        // TASK 2

        /*
        -Print out questions
        -Create the methods of Scanner
        -Create variable for current year
        -Concatenate variables, complete the equations and print String
         */

        System.out.println("What is your first name? ");
        String firstName = userInput.next();
        System.out.println("What is your last name? ");
        String lastName = userInput.next();
        System.out.println("What is your year of birth? ");
        int birthYear = userInput.nextInt();
        int currentYear = 2022;
        System.out.println(firstName + " " + lastName+ "\'s age is = " + (currentYear - birthYear));


                                    // TASK 3
        /*
        -Ask Questions
        -Create the method of Scanner
        -Concatenate variables with String and Print
         */
        System.out.println("What is your full name? ");
        userInput.nextLine();                            // The scanner nextLine() issue addressed
        String fullName = userInput.nextLine();
        System.out.println("What is your weight? ");
        int weight = userInput.nextInt();
        System.out.println(fullName+ "\'s weight is = " + weight * 2.205 + " lbs.");

            /*
            Write a program that asks 3 students to enter their full name and age
-Then print each student’s age with their full names as {fullName}’s age is
{age}.
-And, calculate the average age for these students and print result as The average
age is {averageAge}.
-And, find the eldest age and print result as The eldest age is {eldestAge}.
-And, find the youngest age and print result as The youngest age is
{youngestAge}
             */
                                    // TASK 4
        /*
        -Print out questions
        -Create the method of scanner
        -Create variable for average age, youngest, and eldest
        -Concatenate variables and print out string
         */
        System.out.println("What is your full name?");
        userInput.nextLine();                           // addressing the nextLine() issue
        String fullName1 = userInput.nextLine();

        System.out.println("What is your age? ");
        int age1 = userInput.nextInt();

        System.out.println("What is your full name?");
        userInput.nextLine();                           // addressing the nextLine() Issue
        String fullName2 = userInput.nextLine();

        System.out.println("What is your age? ");
        int age2 = userInput.nextInt();
        System.out.println("What is your full name?");
        userInput.nextLine();                           // addressing the nextLine() Issue
        String fullName3 = userInput.nextLine();
        System.out.println("What is your age? ");
        int age3 = userInput.nextInt();
        int averageAge = (age1 + age2 + age3)/3;
        int eldestAge = age1;
        int youngestAge = age2;
        System.out.println(fullName1 + "\'s age is " + age1 + ".\n" + fullName2 + "\'s age is "
                          + age2 + ".\n" + fullName3 + "\'s age is " + age3 + ".\nThe average age is "
                          + averageAge + ".\nThe eldest age is " + eldestAge + ".\nThe youngest age is "
                          + youngestAge+ ".");




    }
}
