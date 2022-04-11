package loops.forLoop;

public class PrintNumbersDivisibleBy5 {
    public static void main(String[] args) {

        /*
        Write a program to check numbers from 1 to 50 both included and print all the numbers that can be divided by 5
         */

        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
