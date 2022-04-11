package ifElseStatement.ifElseStatement;

import java.util.Scanner;

public class Between0And100 {
    public static void main(String [] args){

        /*
Write a program asks user to put number and checks if the number
is between 0 and 100

if it is true print out "It is in between 0 and 100"

else "it is not in between 0 and 100"
 */


        Scanner print = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = print.nextInt();

        boolean isNumBiggerThan0 = num >= 0;
        boolean isNumSmallerThan100 = num <= 100;
        boolean isBetween0And100 = isNumBiggerThan0 && isNumSmallerThan100;

        if(num >= 0 && num <= 100)
        {System.out.println("It is in between 0 and 100");

        }else{System.out.println("It is not in between 0 and 100");

        }
    }
}
