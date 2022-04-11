package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindIfNumberIsPositiveNegativeOrZero {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter a number!");
//        int num1 = input.nextInt();
        int num1 = ScannerHelper.getNumberFromUser();

        if (MathHelper.isPositive(num1)) {
            System.out.println("The number is positive");

        } else if (MathHelper.isNegative(num1)) {
            System.out.println("The number is negative");
        } else
            System.out.println(MathHelper.isNumber0(num1));
        }

    }

