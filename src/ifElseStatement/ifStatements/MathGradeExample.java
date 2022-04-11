package ifElseStatement.ifStatements;

import java.util.Scanner;

public class MathGradeExample {
    public static void main(String [] args) {

        /*
        Assume David took a math exam and the passing grade for the
exam was 60.
•Write a program that asks David what his grade is. If David’s
grade is greater than or equal to 60, then print message
“Awesome! You have passed the math class!”
         */
        Scanner scan = new Scanner(System.in);

        /*
        1. Create the Scanner
        2. Ask the question
        3. Store the grade
        4. If statement with proper action
         */

        System.out.println("What is your grade?");
        int grade = scan.nextInt();

       // boolean mathGrade = grade <= 60;  // Does not need to be stored

        if(grade >= 60){System.out.println("Awesome! You have passed the math class!");

        } else { System.out.println("Go back to school!!");


        }







    }
}
