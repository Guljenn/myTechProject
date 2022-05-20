package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework18 {



                        // TASK 1 - noSpace()

    public static String noSpace(String str) {
        return str.trim().replaceAll(" ", "");
    }

                        // TASK 1 - noSpace() Second Way
    public static String noneSpace (String str){
       return str.trim().replaceAll("\\s", "");
    }


                       // TASK 2 - replaceFirstLast()


    public static String replaceFirstLast(String str){
        if(str.trim().length() < 2) return "";
        else return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
    }

                      // TASK 3 = hasVowel()


    public static boolean hasVowel(String str) {
        if (str.length() < 1) return false;
        for ( char c : str.toLowerCase().toCharArray()){
            if(Character.isDigit(c)) return false;
            else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){

            }
        }
        return true;
    }

                    // TASK 4 checkAge()

    public static void checkAge(int YOB){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

        if(Integer.parseInt(sdf.format(date)) - YOB >= 0 && Integer.parseInt(sdf.format(date)) - YOB < 16)
        System.out.println("AGE IS NOT ALLOWED!");
        else if(Integer.parseInt(sdf.format(date)) - YOB >= 16  && Integer.parseInt(sdf.format(date)) - YOB <= 100)
        System.out.println("AGE IS ALLOWED !");
        else System.out.println("AGE IS NOT VALID!");
    }

                    // TASK 5 averageOfEdges()


    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

                    // TASK 6 noA()


    public static String[] noA(String[] arr){
     for(int i = 0; i <= arr.length-1; i++){
         if(arr[i].toLowerCase().startsWith("a")){
             arr[i] = "###";
         }
     }
        return arr;
    }

                                  // TASK 7 - no3Or5()

    public static int[] no3Or5 (int[] arr){

        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] % 15 == 0) arr[i] = 101;
            else if(arr[i] % 5 == 0) arr[i] = 99;
            else if(arr[i] % 3 == 0) arr[i] = 100;

        }
        return arr;
    }

                                // TASK 8 - countingPrimes()

    public static int countingPrimes(int[] arr){
        int count = 0;
        for (int number : arr) {
            if(number == 2 || number == 3) count++;
            else if (number > 3){
                boolean prime = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(".............TESTING noSpace().............");

        System.out.println(noSpace("   Hello World   "));
        System.out.println("Java");

        System.out.println("\n..........TESTING noSpace() SECOND WAY");
        System.out.println(noneSpace("   Hello World   ")); //HelloWorld
        System.out.println("Java");  // Java

        System.out.println("\n.............TESTING replaceFirstLast().............");

        System.out.println(replaceFirstLast("Hello"));  // oellH
        System.out.println(replaceFirstLast("Tech Global"));   // lech GlobalT
        System.out.println(replaceFirstLast("    A    "));  // ""
        System.out.println(replaceFirstLast("A"));  // ""


        System.out.println("\n.............TESTING hasVowel().............");
        System.out.println(hasVowel(""));  // false
        System.out.println(hasVowel("Java"));  // true
        System.out.println(hasVowel("1234"));  // false
        System.out.println(hasVowel("ABC"));  // true

        System.out.println("\n.............TESTING checkAge().............");
        checkAge(2006);  // AGE IS ALLOWED!
        checkAge(2005);  // AGE IS ALLOWED!
        checkAge(2050);  // AGE IS NOT VALID
        checkAge(1920);  // AGE IS NOT VALID
        checkAge(1800);  // AGE IS NOT VALID

        System.out.println("\n.............TESTING averageOfEdges().............");
        System.out.println(averageOfEdges(0,0,0));  // 0
        System.out.println(averageOfEdges(0,0,6));  // 2
        System.out.println(averageOfEdges(-2,-2,10));  // 4
        System.out.println(averageOfEdges(-3,15,-3));  // 6
        System.out.println(averageOfEdges(10,13,20));  // 15

        System.out.println("\n.............TESTING noA().............");

        System.out.println(Arrays.toString(noA(new String[] {"java", "hello", "123", "xyz"})));  // [“java”, “hello”, “123”, “xyz”]
        System.out.println(Arrays.toString(noA(new String[] {"appium", "123", "ABC", "java"}))); // [“###”, “123”, “###”, “java”]


        System.out.println("\n.............TESTING no3Or5().............");

        System.out.println(Arrays.toString(no3Or5(new int[] {7, 4, 11, 23, 17}))); // [7, 4, 11, 23, 17]
        System.out.println(Arrays.toString(no3Or5(new int[]{3, 4, 5, 6}))); // [100, 4, 99, 100]
        System.out.println(Arrays.toString(no3Or5(new int[]{10, 11, 12, 13, 14, 15}))); // [99, 11, 100, 13, 14, 101]


        System.out.println("\n.............TESTING countingPrimes().............");
        System.out.println(countingPrimes(new int[]{-10, -3, 0, 1}));  // 0
        System.out.println(countingPrimes(new int[]{7, 4, 11, 23, 17})); // 4
        System.out.println(countingPrimes(new int[] {41, 53, 19, 47, 67})); // 5



    }
}
