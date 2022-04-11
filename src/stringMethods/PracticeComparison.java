package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args) {

//        Test data 1:
//        Java
//                java
//
//        Expected output 1:
//        These strings are not equal
//
//        Test data 2:
//        Hello
//                Hello
//
//        Expected output 2:
//        These strings are equal



//        Scanner input = new Scanner (System.in);
//        System.out.println("Please enter a string");
//        String s1 = input.nextLine();
//        System.out.println("Please enter another string");
//        String s2 = input.nextLine();
//
//        if(s1.equals(s2)) {
//            System.out.println("The strings are equal!");
//        }
//        else System.out.println("The strings are not equal!");

        String str = ScannerHelper.getStringFromUser();
        String str1 = ScannerHelper.getStringFromUser();
//        if(str .equalsIgnoreCase(str1))
//        System.out.println("These strings are equal");
//        else System.out.println("These strings are not equal");

        String resultMessage = str.equalsIgnoreCase(str1)?"These strings are equal" : "These strings are not equal";
        System.out.println(resultMessage);


//
//        public static void main(String[] args) {
//            //1st way
//            System.out.println("\n---------1st-way---------\n");
//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Please enter a string");
//            String s1 = input.nextLine();
//
//            System.out.println("Please enter another string");
//            String s2 = input.nextLine();
//
//            if(s1.equals(s2)) System.out.println("These string are equal");
//            else System.out.println("These strings are not equal");
//
//
//            //2nd way
//            System.out.println("\n---------2nd-way---------\n");
//            System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "These string are equal" : "These string are not equal");
//
//
//


    }
}