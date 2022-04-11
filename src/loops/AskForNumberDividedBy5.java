package loops;

import java.util.Scanner;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {
        /*
        Write a program that asks the user to enter a number.
        if it is divided by 5 then finish the program but if number
        is not divided by five, keep asking the user to enter a new number until user enters a number
        that is divided by 5
         */

        Scanner scan = new Scanner(System.in);
        int userNumber;
        int attempt = 1;

        do{
            if(attempt == 1) System.out.println("Please enter a number that is divisible by 5");
            else System.out.println("Please enter a new number");
            userNumber = scan.nextInt();
            if(userNumber % 5 != 0) System.out.println("This number is not divisible by 5");
            attempt++;
        }while(userNumber % 5 != 0);
        System.out.println("This is perfect!!");

    }
}
