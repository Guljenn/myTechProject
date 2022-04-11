package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        System.out.println("Please enter number 3");
        int num3 = scan.nextInt();
        int total = num1 + num2 + num3;
        System.out.println("The sum of the numbers you entered is" + " " + total);



    }
}
