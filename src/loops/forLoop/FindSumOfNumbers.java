package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {

        /*
    Write a Java program to find sum of the numbers from 10 to 15 (10 and 15 are included)
    10+11+12+13+14+15


    Expected output:
    75
     */
      int sum = 0;
        for(int i = 10; i <= 15; i++){
            sum += i;
          //  System.out.println(sum); // 10..........
        }
        System.out.println(sum);  // the sout needs to be outside of the loop so that we only get the sum and not
                                       // added values. // 75



    }
}
