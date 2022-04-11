package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {

        String name = ScannerHelper.getNameFromUser();
        System.out.println("First character of the name is " + name.charAt(0));
        System.out.println("The last character of the name is " + name.charAt(name.length()-1));
        // this is the formula to find the last character name.charAt(name.length()-1));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1 = input.nextLine();
        System.out.println("The first character of " + name1 + "is = " + name1.charAt(0));
        System.out.println("The last character of " + name1 + "is =  " + name1.charAt(name1.length()-1));

        String name2 = "keli";
        System.out.println(name2.charAt(name2.length()/2-1) + "" + name2.charAt(name2.length()/2));
    }
}
