package ifElseStatement.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String [] args){

        /*
        -create a Scanner object
        -Ask a question about their age
        -Retrieve age
        -Use if statement and proper action in curly braces
         */

        Scanner collect = new Scanner (System.in);

        System.out.println("Please enter your age");
        int age = collect.nextInt();

      //  boolean retired = age >= 55;

        if(age >= 55){ System.out.println("It is your time to retire! ");
        }else
        {System.out.println("You will not retire!");

        }


    }
}
