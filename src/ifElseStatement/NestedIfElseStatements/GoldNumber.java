package ifElseStatement.NestedIfElseStatements;

public class GoldNumber {
    public static void main(String [] args){

                        /*
    Write a program that generates a random number bt -50 and 50
    if number is positive, then we will win 10 points
    if number is more than 25, then we will win extra 10 points
    if number is -7, then we will win extra 10 points
    lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
    */

        int num = (int)(Math.random() * 101) - 50;
        System.out.println(num);
        if(num > 0){
            System.out.println("You will win 10 points!");
          if(num > 25){
              System.out.println("Now you will win an extra 10 points!");
           if(num == -7){
               System.out.println("Then you will win another extra 10 points!");
           }
          }
        }


    }
}
