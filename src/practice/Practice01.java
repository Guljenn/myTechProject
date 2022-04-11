package practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The remainder of 25 % 8 is: " + a % b);

        System.out.println("Please enter 5 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        System.out.println("The average entered by the user is: " + (num1 + num2 + num3 + num4 + num5) / 5);

        System.out.println("Please enter a number");
        int x = input.nextInt();

        System.out.println(
                x + " * 1 = " + (x * 1) + "\n" +
                x + " * 2 = " + (x * 2) + "\n" +
                x + " * 3 = " + (x * 3) + "\n" +
                x + " * 4 = " + (x * 4) + "\n" +
                x + " * 5 = " + (x * 5) + "\n" +
                x + " * 6 = " + (x * 6) + "\n" +
                x + " * 7 = " + (x * 7) + "\n" +
                x + " * 8 = " + (x * 8) + "\n" +
                x + " * 9 = " + (x * 9) + "\n" +
                x + " * 10 = " + (x * 10) + "\n");

        System.out.println("Please enter 3 numbers");
        int g = input.nextInt();
        int u = input.nextInt();
        int l = input.nextInt();


        System.out.println("Max value is = " + Math.max(Math.max(g,u),l) +
                "\nMin value is = " + Math.min(Math.min(g,u),l));

        System.out.println("Please enter 2 numbers");
        int egg = input.nextInt();
        int cited = input.nextInt();

        System.out.println("The absolute value of the number is = " + Math.abs(egg - cited));

       System.out.println("Please enter 3 numbers");
       input.nextInt();
       int random1 = (int) (Math.random() * 51) + 50;
       int random2 = (int) (Math.random() * 51) + 50;
       int random3 = (int) (Math.random() * 51) + 50;
       int sum = random1 + random2 + random3;

       System.out.println("Number 1 is = " + random1 + "\nNumber 2 is = " + random2 + "\nNumber 3 is = " +
                           random3 + "\nThe sum of numbers are = " + sum);

       int randomNum1 = (int)(Math.random() * 147) + 101;
       System.out.println(randomNum1);

       System.out.println((int)(Math.random() * 26) + 25);

       double alex = 125 - 25.5;
       double mike = 220 + 25.5;
       System.out.println("Alex's money: $" + alex + "\nMike's money: $" + mike);

       double bike = 390;
       double save = 15.60;

       System.out.println((int)(bike/save));







    }
}