package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {


        //  TASK 1
        int randomNum1 = (int) (Math.random() * 51);

        if (randomNum1 >= 10 && randomNum1 <= 25) {
            System.out.println(+randomNum1 + " = True");
        } else System.out.println(+randomNum1 + " = False");


        //    TASK 2

        int randomNum2 = (int) (Math.random() * 100) + 1;

        if (randomNum2 <= 50) { // 1- 50
            System.out.println(randomNum2 + " is in the first half");

            if (randomNum2 <= 25) { //1- 25
                System.out.println(randomNum2 + " is in the first quarter");
            } else { // 26 - 50
                System.out.println(randomNum2 + " is in the second quarter");
            }
        } else { // 51 - 100
            System.out.println(randomNum2 + " is in the second half");

            if (randomNum2 <= 75) {
                System.out.println(randomNum2 + " is in the third quarter");
            } else {
                System.out.println(randomNum2 + " is in the fourth quarter");
            }
        }


//        if ( randomNum2 <= 25) {
//            System.out.println(randomNum2 + " is in the first quarter");
//
//        } else if (randomNum2 >= 25 && randomNum2 <= 50) {
//            System.out.println(randomNum2 + " is in the 2nd quarter");
//        }
//        else if (randomNum2 <= 50) {
//            System.out.println(randomNum2 + " is in the 1st half");
//
//        } else if (randomNum2 >= 50 && randomNum2 <= 75) {
//            System.out.println(randomNum2 + " is in the 3rd quarter");
//
//        }
//        if (randomNum2 >= 50 && randomNum2 <= 100) {
//            System.out.println(randomNum2 + " is in the 2nd half");
//
//        }
//        if (randomNum2 >= 75 && randomNum2 <= 100) {
//            System.out.println(randomNum2 + " is in the 4th quarter");
//        }


        // TASK 3
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1 - 10");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();


    }
}