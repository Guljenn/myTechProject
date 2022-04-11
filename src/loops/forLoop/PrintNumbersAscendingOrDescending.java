package loops.forLoop;

import java.util.Random;


public class PrintNumbersAscendingOrDescending {
    public static void main(String[] args) {

        /*
        Write a program that generates 2 random numbers between 0 and 25 both included. Then print
        all numbers between 2 random numbers that can be divided by 5 in ascending order
         */

        //  int num = (int) Math.random() * 26;
        Random randomNum = new Random();
        int num1 = randomNum.nextInt(26);
        int num2 = randomNum.nextInt(26);


        System.out.println("random number = " + num1);
        System.out.println("random number = " + num2);

//           if(num1 > num2){
//               for(int i = num2; i <= num1; i++){
//                   if(i % 5 != 0) {
//                       System.out.print(i + " ");
//                   }
//               }
//
//               }
//           else{
//               for(int i = num1; i <= num2; i++){
//                   if (i % 5 != 0){
//                       System.out.print(i + " ");
//                   }
//               }
//           }

           // SECOND WAY
        String s = "";
        for(int i = Math.min(num1,num2); i <= Math.max(num1,num2); i++){
            if(i % 5 != 0){
                s += i + " - ";
            }
        }
                 System.out.print(s.substring(0,s.length()-2));


    }
}