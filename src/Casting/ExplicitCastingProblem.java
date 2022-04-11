package Casting;

import java.util.Scanner;

public class ExplicitCastingProblem {
    public static void main(String[] args) {

        int num = 150;
        byte b = (byte) num;

        System.out.println(b);

        /*
       Write a program ASKS user for 5 of their grades and print out their avg

       Input:
        45
        50
        55
        65
        70

        Output:
        55
        */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 5 of your grades ");

        int grade = userInput.nextInt();
        int grade1 = userInput.nextInt();
        int grade2 = userInput.nextInt();
        int grade3 = userInput.nextInt();
        int grade4 = userInput.nextInt();
        int average = (grade + grade1 + grade3 + grade4 + grade2) / 5;
        String average1 = "" + average;
        System.out.println(average1);

                                /*
         Write a program that asks users their balance as
a string and asks for 3 transactions as string end
print out the end result as double.


         Input:
        "What is your balance?"
         user:
         456.7

       "What is your next 3 transactions?
        user:
        34.1
        65.3
        28.4

        Output:
       "Your balance is now = x"

*/
        System.out.println("What is your balance? ");
        String balance = userInput.next();

        System.out.println("What is your next 3 transactions? ");
        String t1 = userInput.next(), t2 = userInput.next(), t3 = userInput.next();

        double balanceD = Double.valueOf(balance);
        double t1d = Double.valueOf(t1);
        double t2d = Double.valueOf(t2);
        double t3d = Double.valueOf(t3);


      /*
      System.out.println("What is your balance?");
        String balance = scan.next();

        System.out.println("What is your next 3 transactions");

        System.out.println(
                "Your balance is now = " + (Double.valueOf(balance)
                        - Double.valueOf(scan.next())
                        - Double.valueOf(scan.next())
                        - Double.valueOf(scan.next()))

    */
        /*
        Write a program ASK user for full name, age, phone number then
enter their 3 kids age as string then print out everything plus
the oldest kid, youngest and the age difference between oldest
and youngest.

Program: "Please enter your name"
User: John Doe
Program: "Please enter your age:
User: 45
Program: "Please enter your phone number:
User: (123) 123 1234
Program: "Enter the ages of your kids"
User:
12
22
17
Program:
Your name is John Doe, your phone number is (123) 123 1234,
You are 45 years old, Your oldest kid is 22 years old, your
youngest is 12, difference between oldest and youngest is 10
years.
         */

        System.out.println("Please enter your name");
        userInput.nextLine();
        String fullName = userInput.nextLine();

        System.out.println("Please enter your age");
        String age = userInput.next();

        System.out.println("Please enter your phone number");
        userInput.nextLine();
        String phoneNum = userInput.nextLine();

        System.out.println("Enter the ages of your children");
        String age1 = userInput.nextLine(), age2 = userInput.nextLine(), age3 = userInput.nextLine();

        int doeAge = Integer.parseInt(age);
        int age1K = Integer.parseInt(age1);
        int age2K = Integer.parseInt(age2);
        int age3K = Integer.parseInt(age3);
        Math.max(Math.max(age1K, age2K), age3K);


        System.out.println("Your name is " + fullName + "," + "your phone number is " + phoneNum +
                "\nYou are  " + doeAge + "years old, Your oldest kid is " + age1K + "years old," +
                "your\n youngest is " + age2K + ", difference between oldest and youngest is" +
                Math.max(Math.max(age1K, age2K), age3K));


    }
}
