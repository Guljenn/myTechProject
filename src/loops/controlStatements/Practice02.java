package loops.controlStatements;

import utilities.ScannerHelper;

public class Practice02 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 integers 0 - 10 both included
        Print all the numbers between given 2 integers starting from smallest
        to biggest (given numbers are included)
        DO NOT PRINT THE NUMBER 5
         */
         int num1 = ScannerHelper.getNumberFromUser();
         int num2 = ScannerHelper.getNumberFromUser();

         for(int i = Math.min(num1,num2); i <= Math.max(num1,num2); i++){
             if(i == 5) continue;
             System.out.println(i);
         }

    }
}
