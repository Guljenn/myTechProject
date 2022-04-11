package ifElseStatement;

import java.util.Scanner;

public class MathGrade {
    public static void main(String [] args){

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your balance, David");
        double bal = collect.nextInt();
        double balance = 600;
        boolean balInfo = balance >= 600;

        if(balInfo)
        {System.out.println("Awesome, David! You have enough money!");

        }else{System.out.println("Sorry, David! You are poor!");

        }
    }
}
