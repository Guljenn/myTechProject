package loops;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter multiple numbers
        and find the sum of numbers given by the user
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please tell me how many numbers you would like me to add");
        int totalNumbers = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= totalNumbers; i++){
            System.out.println("Please enter number " + i);
            sum += input.nextInt();
        }

        System.out.println(sum);
        int sum1 = 0;
        int a = 1;
        while ( a <= totalNumbers){
            System.out.println("Please enter number " + a);
            sum1 += input.nextInt();
            a++;


        }
        System.out.println(sum1);
    }
}
