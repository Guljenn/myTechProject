package loops.forLoop;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from user
        reverse the name and print it back
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scan.nextLine();
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }
        System.out.print("The reversed name is " + reversedName);
        System.out.println("\nThe reversed name to uppercase is " + reversedName.toUpperCase());
    }
}
