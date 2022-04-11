package loops.forLoop;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        /*
        write a program that prints all even numbers from 0 to 10 both included
         */

        for(int i = 0; i <= 10; i++){
            if(MathHelper.isEven(i)){    // if(i % 2 == 0)
                System.out.println(i);
            }
        }
    }
}
