package javamemorymanagement;

public class ReverseExercise {

        /*
        Write a method that takes a string that takes a string and returns it reversed
         */
    public static String reverse1(String str){
        String r = "";
        for(int i = str.length()-1; i >= 0; i--)
            r += str.charAt(i);

        return r;
    }

    public static String reverse2(String str){
        return new StringBuilder(str).reverse().toString();
    }

    /*
    Create a method that takes a string and check if it is polindrame. If palindrome, return true, if not reverse false
     */

    public static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
