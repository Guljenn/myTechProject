package utilities;

import projects.Project03;

public class MathHelper {

    // Create a method that takes 3 ints and returns the max

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    // method overloading
    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));

    }

    public static byte minOfThree(byte num1, byte num2, byte num3) {
        return (byte) Math.min(num1, Math.min(num1, num3));
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int absoluteValue(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public static double absoluteValue(double num1, double num2) {
        return Math.abs(num1 - num2);
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static boolean isEven(int num1) {
        return num1 % 2 == 0;
    }

    public static boolean isOdd(int num1) {
        return num1 % 2 != 0;
    }

    public static boolean isPositive(int num1) {
        return num1 > 0;
    }

    public static boolean isNegative(int num1) {
        return num1 < 0;

    }
    public static boolean isSquareRoot (int num) {
        if (num == num * num) {
        } return num == num * num;

    }


    public static boolean isNumber0(int num1) {
        return num1 == 0;

    }

    public static String divisible(int num1) {
        if (num1 % 15 == 0) {
            return "Divisible by 15";

        }
        else if (num1 % 5 == 0) {
            return "Divisible by 5";

        }
        else if (num1 % 3 == 0) {
            return "Divisible by 3";
        }
        else return "Not divisible";

    }




    }

