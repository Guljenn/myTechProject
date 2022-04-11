package loops;

public class FizzBuzz {
    public static void main(String[] args) {

        /*
        Print all numbers that start from 1 to 30, both included
        if number is divisible by 3, then print Fizz instead of the number
        If number is divisible by 5, then print Buzz instead of the number
        If number is divided by 3 and 5, then print FizzBuzz
         */
        for(int i = 1; i <= 30; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }
}
