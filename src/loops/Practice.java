package loops;

public class Practice {
    public static void main(String[] args) {
        /*
        Write a program that prints all the numbers between 1 and 100 both included
        Do not print any numbers that can be divided by 2 or 3.
         */

        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0 && i % 3 !=0) {
                System.out.println(i);

        int start = 1;
        while(start < 101) {
            if(start % 2 !=0 && start % 3 != 0) System.out.println(start);
            start++;
        }


            }
        }



    }
}
