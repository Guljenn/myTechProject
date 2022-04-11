package loops.forLoop;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

        /*
        Write a java program that asks user to enter a number. Print all the numbers that begin with 0 and the given
        number.
         */
        int number = ScannerHelper.getNumberFromUser();

        for(int i = 0; i <= number; i++){
            if(MathHelper.isOdd(i))
                System.out.println(i);
        }
    }
}
