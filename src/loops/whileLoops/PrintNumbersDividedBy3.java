package loops.whileLoops;

public class PrintNumbersDividedBy3 {
    public static void main(String[] args) {

        /*
        Write a Java program to check the numbers 1 - 30 ( 30 included)
        and print all the numbers that can be divisible by 3
         */

        //while loop
        int i = 1;
        while (i <= 30) {
            if (i % 3 == 0) System.out.println(i);
            i++;
        }

        // for loop
        for(int a = 1; a <= 30; a++){
            if(a % 3 == 0){
                System.out.println(a);
            }
        }

    }
}
