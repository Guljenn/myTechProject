package ifElseStatement;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter which day it is (1 to 5)
        Based on the answer, print what color will he be wearing
        1. Monday -> Black
        2. Tuesday -> Red
        3. Wednesday -> Purple
        4. Thursday -> Yellow
        5. Friday -> Orange
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What day is it today?");
        int day = input.nextInt();
        if (day == 1) System.out.println("You are wearing Black!");
        else if (day == 2) System.out.println("You are wearing Red!");
        else if (day == 3) System.out.println("You are wearing Purple!");
        else if (day == 4) System.out.println("You are wearing Yellow!");
        else if (day == 5) System.out.println("You are wearing Orange!");
        else if(day == 6 || day == 7)System.out.println("It is the weekend!");
        else System.out.println("You have not entered a day!");

    }
}



