package ifElseStatement.ifElseStatement;



public class Exercise01 {
    public static void main(String [] arg){
        /*
        Write a program that is going to create 3 random numbers between 45 - 90.
        Print out all the numbers max, min, and the middle.

         */
        int random1 = (int)(Math.random() * 46) + 45;
        int random2 =(int)(Math.random() *46) + 45;
        int random3 =(int)(Math.random() *46) + 45;
        int max = Math.max(Math.max(random1,random2),random3);
        int min = Math.min(Math.min(random1,random2),random3);
        System.out.println("num1 = " + max + "\nnum2 = " + random2 + "\nnum3 = " + min);






    }
}
