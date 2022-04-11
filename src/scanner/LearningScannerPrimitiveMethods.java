package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String [] args){
        Scanner collect = new Scanner(System.in);   //object


        System.out.println("What is your account balance?");
        double ab = collect.nextDouble();
        System.out.println("\'User's account balance is\' " + "$" +ab);

        System.out.println("Do you understand today's Java class?");
        boolean checkforunderstanding = collect.nextBoolean();
        System.out.println("The student's response =" + checkforunderstanding);
    }
}
