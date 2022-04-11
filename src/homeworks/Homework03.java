package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String [] args){

                                            // TASK1

        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter 2 numbers ");
        int num1 = collect.nextInt(), num2 = collect.nextInt();
        System.out.println("The number 1 entered by user is = " + num1 + "\nThe number 2 entered by user" +
                "is = " + num2 + "\nThe sum of number 1 and 2 entered by the user is + " + (num1 + num2));

                                            // TASK 2

        System.out.println("\nPlease enter 2 floating numbers");
        double flt1 = collect.nextDouble();
        double flt2 = collect.nextDouble();
        System.out.println("\nThe number 1 entered by user is = " + flt1 + "\nThe number 2 entered by user is = " +
                +num2 + "\nThe division of number 1 and 2 entered by user is = " + flt1 / flt2);

                                        // TASK 3
        int a = 7 * 5 -10;
        int b = (72 + 24) % 24;
        int c = (10 + - 3 * 9 / 9);
        int d = 5 + 18 / 3 * 3 - ( 6% 3);

        System.out.println("1. " + a + "\n2. " + b + "\n3. " + c + "\n3. " + d);

                                        // TASK 4
        System.out.println("\nPlease enter 2 floating numbers. ");
        double number1 = collect.nextDouble(),  number2 = collect.nextDouble();
        System.out.println("The sum of the given numbers is = " + (number1 + number2) + "\nThe product" +
                "of the given numbers is = " + number1 * number2 + "\nThe subtraction of the given " +
                "numbers is = " + (number1 - number2) + "\nThe division of the given numbers is = " + number1 / number2 +
                "\nThe remainder of the given numbers is = " + number1 % number2);

                                      // TASK 5

        double wOfRec = 7.5;
        double hOfRec = 10.5;
        System.out.println("\nThe area of the rectangle  = " + wOfRec * hOfRec + "\nThe " +
                "perimeter of the rectangle = " + (wOfRec + hOfRec) * 2);

                                        // TASK 6
        double averageSal = 90000;
        System.out.println("\nA Software Engineer in Test can earn " + averageSal * 3 + " in 3 years.");






    }
}
