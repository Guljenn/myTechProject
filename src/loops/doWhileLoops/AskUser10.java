package loops.doWhileLoops;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {

        /*
        Write a Java Program that asks user to enter a number
        if number is more than or equal to 10, then finish the program but if number is less than 10
        keep asking the user to enter a new number until user enters a number that is more than
        or equal to 10
         */
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter a number"); // remember java reads from top to bottom
        int userNumber; // if you want to reuse variable throughout your class

        do {
            System.out.println("Please enter a new number");
             userNumber = scan.nextInt(); // declared variable is reassigned here to scanner
        } while (userNumber <= 10); // once this condition is true then the loop will terminate
        System.out.println("Thank you ");



    }
}
