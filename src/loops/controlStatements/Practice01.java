package loops.controlStatements;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        Print all the numbers between given 2 integers starting from biggest to smallest
        given numbers are included
        However, do not print any number less than 10
         */


        int num1 = ScannerHelper.getNumberFromUser();
        int num2 = ScannerHelper.getNumberFromUser();


        for(int i = Math.max(num1, num2); i >= Math.min(num1,num2); i--){
            if(i < 10) break;
            System.out.println(i);
        }
    }
}
