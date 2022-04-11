package practice;

import java.util.Scanner;

public class PracticeIfStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // System.out.println("Please enter your age.");
        // int age = input.nextInt();
        //  if(age >= 55){
        //     System.out.println("It is your time to retire!");

        //   System.out.println("David please enter your grade!");
        //  int grade = input.nextInt();
        //  if (grade >= 60) {
        //    System.out.println("You passed!");

        //   } else {
        //    System.out.println("You need to study more!");

        //   System.out.println("Please enter a number!");
        //    int num = input.nextInt();

        //    if(num % 2 == 0){
        //       System.out.println("The number you entered is even!");
        //    }else {
        //        System.out.println("The number is not even!");

        System.out.println("What day is it today?");

        // boolean isWeekday = true;
        //boolean isWeekend = true;


        // if(isWeekend){
        //     System.out.println("It is weekend!");
        //}else{
        //   System.out.println("It is a weekday!");

        /*

Write a program that asks David what his balance. If David's balance is greater
than or equal to $600.0, then print message "Awesome! You have enough money!".
If David's balance is less than $600.0, then print message "Sorry!  You are poor!".

EXAMPLE PROGRAM 1
Program: Hey David! Please enter your balance?
User: 600.0

Program: Awesome! You have enough money!

EXAMPLE PROGRAM 2
Program: Hey David! Please enter your balance?
User: 59

Program: Sorry! You are poor!

 */

        System.out.println("Please enter your name!");
        String fullName = input.nextLine();

        System.out.println("Hey " + fullName + ", please enter your balance!");
        double bal = Double.parseDouble(input.nextLine());

        if (bal >= 600.0) {
            System.out.println("Awesome! You have enough money!");
        } else {
            System.out.println("Sorry, you are poor!");
        }

      /*
        Write a program that asks user to enter a number.
        If the number entered is dividable by 7, then print message
        "The number you entered is dividable by 7!"
        If the number entered is dividable by 7, then print message
        "The number you entered is not dividable by 7!"


        EXAMPLE PROGRAM 1
        Program: Please enter a number?
        User: 7

        Program: The number you entered is dividable by 7!

                EXAMPLE PROGRAM 2
        Program: Please enter a number?
        User: 13

        Program: The number you entered not dividable by 7!

                */
        System.out.println("Please enter a number!");
        int num = input.nextInt();

        if (num % 7 == 0) {
            System.out.println("The number you entered is divisible by 7!");
        } else {
            System.out.println("The number you entered is not divisible by 7!");
        }

        /*
Write a program asks user to put number and checks if the number
is between 0 and 100

if it is true print out "It is in between 0 and 100"

else "it is not in between 0 and 100"
 */

        System.out.println("Please enter a number!");
        int a = input.nextInt();
        boolean isNumberBiggerThan0 = a >= 0;
        boolean isNumberLessThan0 = a <= 100;
        boolean inBetween0And100 = isNumberBiggerThan0 && isNumberLessThan0;

        if (inBetween0And100) {
            System.out.println("It is in between 0 and 100 ");

        } else {
            System.out.println("It is not in between 0 and 100");
        }


    }
}

