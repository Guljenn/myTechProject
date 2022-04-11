package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String [] args) {
        // TASK 1
            /*
                -Write a program that generates 4 random numbers
                 between 0 and 10 (0 and 10 are also included).
                -Store numbers in proper variables and print them first
                -Print each number’s absolute difference with 5
                -Find greatest and print the result with a proper message
                -Find smallest and print the result with a proper message

              */


        int a = (int) (Math.random() * 11);
        int b = (int) (Math.random() * 11);
        int c = (int) (Math.random() * 11);
        int d = (int) (Math.random() * 11);
        int inc = 1;
        System.out.println("Number " + inc++ + " = " + a + "\nNumber " + inc++ +  " =" + b + "\nNumber " + inc++ + " = " + c +
                "\nNumber " + inc + " =" + d);
        System.out.println("Absolute difference of " + a + " with 5 is = " + Math.abs(a - 5) +
                "\nAbsolute difference of " + b + " with 5 is = " + Math.abs(b - 5) +
                "\nAbsolute difference of " + c + " with 5 is = " + Math.abs(c - 5) +
                "\nAbsolute difference of " + d + " with 5 is = " + Math.abs(d - 5));
        if (a >= b && a >= c && a >= d) System.out.println("Greatest number is = " + a);
        else if (b >= a && b >= c && b >= d) System.out.println("Greatest number is = " + b);
        else if (c >= a && c >= b && c >= d) System.out.println("Greatest number is = " + c);
        else System.out.println("Greatest number is = " + d);

        if (a <= b && a <= c && a <= d) System.out.println("Smallest number is = " + a);
        else if (b <= a && b <= c && b <= d) System.out.println("Smallest number is = " + b);
        else if (c <= a && c <= b && c <= d) System.out.println("Smallest number is = " + c);
        else System.out.println("Smallest number is = " + d);

        System.out.println("End of program!");


        //       TASK 2
                 /*
                    - Write a program that generates 8 random int numbers between -50 and 50 (-50
                        and 50 are included)
                    -Store numbers in proper variables and print them first
                    -Find greatest and print the result with a proper message
                    -Find smallest and print the result with a proper message
                    -Find average of all 8 numbers and print result with a proper message
                    -Find the absolute difference between smallest and greatest and print result with
                        a proper message
                    -Print true if 3rd number is positive, false otherwise with a proper message
                    -Print true if 5th number is negative, false otherwise with a proper message
                    -Print true if any of the numbers is zero, false otherwise with a proper message
                */

        int num1 = (int) (Math.random() * 101) - 50;
        int num2 = (int) (Math.random() * 101) - 50;
        int num3 = (int) (Math.random() * 101) - 50;
        int num4 = (int) (Math.random() * 101) - 50;
        int num5 = (int) (Math.random() * 101) - 50;
        int num6 = (int) (Math.random() * 101) - 50;
        int num7 = (int) (Math.random() * 101) - 50;
        int num8 = (int) (Math.random() * 101) - 50;

        System.out.println("Number " + inc + "is = " + num1 + "\nNumber " + inc++ + "is = " + num2 +
                "\nNumber 3 is = " + num3 + "\nNumber 4 is = " + num4 + "\nNumber 5 " +
                "is = " + num5 + "\nNumber 6 is = " + num6 + "\nNumber 7 is = " + num7 +
                "\nNumber 8 is = " + num8);


        System.out.println("Average of 8 numbers is = " + (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8)/8);
        int greatest = Math.max(Math.max(Math.max(Math.max(num1,num2),Math.max(num3,num4)),Math.max(num5,num6)),Math.max(num7,num8));
        int smallest = Math.min(Math.min(Math.min(Math.min(num1,num2),Math.min(num3,num4)),Math.min(num5,num6)),Math.min(num7,num8));
        System.out.println("Absolute difference between smallest and greatest is = " + Math.abs (greatest - smallest));
        if(num3 > 0) {
            System.out.println ("3rd number is positive = true");
        }
        else System.out.println("3rd number is positive = false");

        if(num5 < 0) {
            System.out.println("5th number is negative = true");
        }
        else System.out.println("5th number is negative = false");

        System.out.println("There is at least one zero among those numbers is = " + (num1 == 0 || num2 ==0 || num3 == 0 ||
                num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0));
        System.out.println("End of Program!");

                                            // TASK 3

        /*
            - Write a program that asks user to enter 7 numbers between 0 and 50 (0 and 50 are also included)
            -Store numbers in proper variables and print them first
            -Find greatest and print the result with a proper message
            -Find smallest and print the result with a proper message
            -Find average of all 7 numbers and print result with a proper message
            -Print true if first number is greater than or equal to 10, false otherwise with a proper message
            -Print true if last number is less than or equal to 40, false otherwise with a proper message
            -Print true if both first and last numbers are greater than 25, false otherwise with a proper message
            -Print true if any of the numbers is zero or 50, false otherwise with a proper message
            -Print true if there is no number between 40 and 50 (40 and 50 are included), false otherwise with a
                proper message

         */



        Scanner input = new Scanner (System.in);

         System.out.println("Please enter 7 numbers between 0 and 50! (both 0 and 50 included)");
         int number1 = input.nextInt(); int number2 = input.nextInt();
         int number3 = input.nextInt(); int number4 = input.nextInt();
         int number5 = input.nextInt(); int number6 = input.nextInt();
         int number7 = input.nextInt();

         System.out.println("Number 1 is = " + number1 + "\nNumber 2 is = " + number2 + "\nNumber 3 is = " +
                           number3+ "\nNumber 4 is = " + number4 + "\nNumber 5 is = " + number5 + "\nNumber 6 is = "
                           + number6 + "\nNumber 7 is = " + number7);

         int greatest1 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(number1,number2),number3),number4),number5),number6),number7);
         int smallest1 = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(number1,number2),number3),number4),number5),number6),number7);
         System.out.println("Greatest number is = " + greatest1 + "\nSmallest number is = " + smallest1);
         System.out.println("Average of 7 numbers is = " + (number1 + number2 + number3 + number4 + number5 +
                            number6 + number7) / 7);
         if(number1 >= 10)System.out.println("First number is greater than or equal to 10 = false");
         else System.out.println("First number is greater than or equal to 10 = true");

         if(number7 <= 40)System.out.println("Last number is less than or equal to 40 = true");
         else System.out.println("Last number is less than or equal to 40 = false");

         if(number1 > 25 && number7 > 25 )System.out.println("Both first and last numbers are greater than 25 = true");
         else System.out.println("Both first and last numbers are greater than 25 = false");

         if(number1 == 0 || number2 == 0 || number3 == 0 || number4 == 0 || number5 == 0 || number6 == 0 || number7 == 0
           || number1 == 50 || number2 == 50 || number3 == 50 || number4 == 50 || number5 == 50 || number6 == 50 || number7 == 50)
        System.out.println("At least one of those numbers is 0 or 50 = true");
        else System.out.println("At least one of those numbers is 0 or 50 = false");

        if(number1 < 40 && number2 <40 && number3 <40 && number4 < 40 && number5 < 40 && number6 < 40 && number7 < 40)
            System.out.println("There is no number between 40 and 50 = true");
        else System.out.println("There is no number between 40 and 50 = false");

        System.out.println("End of Program!");

                                            // TASK 4
            /*
                -Write a Java program that generates 3 random numbers between 0 and
                  100 (0 and 100 are included)
                 -find if all numbers are more than 25
                 -Print true if all numbers are greater than 25
                 -Print false if any of the number is less than or equal to 25
             */
        int random1 = (int)(Math.random()* 101);
        int random2 = (int)(Math.random()* 101);
        int random3 = (int)(Math.random()* 101);
        System.out.println(random1 +  " " + random2 + " " + random3);

       if(random1 > 25 && random2 > 25 && random3 > 25)System.out.println("true");
       else System.out.println("false");

                                            // TASK 5
        /*
                 - Write a Java program to ask user to enter a number
                    between 1 and 7 (1 and 7 are included)
                 -Print the day of the week according to given number.
                 -First day is MONDAY and last day is SUNDAY
         */

        System.out.println("Please enter a number between 1 and 7!");
        int x = input.nextInt();

        switch (x){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:

        }

                                        // TASK 6

        /*
        - Write a program that asks user to enter a number between -10 to 10 (-10 and 10 are included)
        - If number is positive, then print a message: “Number entered is POSITIVE”
        - If number is negative, then print a message: “Number entered is NEGATIVE”
        - If number is zero, then print a message: “Number entered is ZERO”
        - If number is even, then also print: “Number entered is EVEN”
        - If number is odd, then also print: “Number entered is ODD”
         */

        System.out.println("Please enter a number between -10 and 10");
        int numberEntered = input.nextInt();

        if(numberEntered >= 0)System.out.println("Number entered is\n POSITIVE");
        if (numberEntered <= 0) System.out.println("Number is\n NEGATIVE");
        if (numberEntered == 0) System.out.println("Number entered is\n ZERO");
        if (numberEntered % 2 == 0) System.out.println("Number is\n EVEN");
        else System.out.println("Number is\n ODD");

                                        // TASK 7
        /*
                    Jennifer is taking a math course . This math course
                    requires students to take 3 exams. At the end, if the
                    average of those exams is more than or equal to 70, then
                    Jennifer will pass the course. However, if the average of
                    those 3 exams is less than 70, then Jennifer will fail.

                    Write a Java program that asks Jennifer to enter her exam
                    results and print if she passed or failed for the exam.

         */

            System.out.println("Please enter your 3 exam results!");
            int exam1 = input.nextInt();
            int exam2 = input.nextInt();
            int exam3 = input.nextInt();
            int averageScore = (exam1 + exam2 + exam3) / 3;

            if (averageScore >= 70)System.out.println("YOU PASSED!");
            else System.out.println("YOU FAILED!");



        }
    }

