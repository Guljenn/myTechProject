package stringMethods;

import java.util.Scanner;

public class SwapLastFourWithFirstFour {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a String, and swaps first and last 4 characters of this String
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String word = scan.nextLine();

        if(word.length() < 8){
            System.out.println("This string does not have 8 characters");

        }else{
            System.out.println(word.substring(word.length()-4) + word.substring(4, word.length()-4) +   word.substring(0,4));
        }
    }
}
