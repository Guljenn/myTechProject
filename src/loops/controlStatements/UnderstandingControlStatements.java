package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /*
        Write a program that prints all the number between 1 - 25
        But skip the numbers that can be divided by 10
        Do not print any number that is more than 15
         */

//        for(int i = 1; i <= 25; i++) {
//            if(i % 10 != 0)
//            System.out.println(i);
//        }
//
//        // using continue control statement to skip numbers that can be divided by 10
//
//        for(int i = 1; i <= 25; i++) {
//            if(i % 10 == 0) continue;
//            else System.out.println(i);
//        }

         /*
        Write a program that prints all the number between 1 - 25
        But skip the numbers that can be divided by 10
        Do not print any number that is more than 15
         */
        for(int i = 1; i <= 25; i++){
            if(i % 10 == 0) continue;
            else System.out.println(i);
            if(i == 15) break;
        }
    }
}
