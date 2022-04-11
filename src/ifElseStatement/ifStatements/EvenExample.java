package ifElseStatement.ifStatements;

import java.util.Scanner;

public class EvenExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter a number");
      //  int evenN = scan.nextInt();

        int num = 8;
       // boolean isEven = num % 2 == 0;  We don't need to use this if we are only going to use it once.

        if(scan.nextInt() % 2 == 0){System.out.println("The number you entered is even! ");

        } else {System.out.println("The number you entered is not even!");

        }

    }
}
