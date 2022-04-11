package loops;

public class FizzBuzz01 {
    public static void main(String[] args) {
        /*
        Print all numbers from 1 to 30.
        if number is divided by 3 print Fizz
        if number is divided by 5 print buzz
        if number is divided by both 3 and 5 print FizzBuzz
         */

        for(int i = 1; i <= 30; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");

            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else System.out.println(i);
        }

    }
}
