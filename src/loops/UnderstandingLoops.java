package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {
        /*
        Write a Java program that will create "Hello" 5 times
         */

        /*
        SYNTAX:
        for(start; termination; update){
            //Block of code to execute
        }
         */

        for (int count = 1; count <= 5 ; count++) {
            System.out.println("Hello");

        }
        int year = 2022;

        for (int i = 10; i <= 30; i++){
            System.out.println("the age is = " + i + " in " +  year);
            year++;
        }

    }
}
