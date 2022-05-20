package homeworks;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Arrays;

public class Homework19 {


                    // TASK 1 FIRST WAY
    public static String noDigit(String str) {
      return str.replaceAll("[0-9]", "");
    }

                    // TASK 1 SECOND WAY
    public static String removeDigits(String str){
        String result = "";
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c)){
            result += c;
            }
        }
        return result;
    }


                            // TASK 2


                            // TASK 2 noVowel()
    public static String noVowel(String str){
        return str.replaceAll("[AEIOU-aeiou]", "");
    }
                            // TASK 2 SECOND WAY removeVowel()
    public static String removeVowel(String str){
        String result = "";
        for(char c : str.toCharArray()){
            if(!(c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e' ||
                 c == 'A' || c == 'I' || c == 'O' || c == 'U' || c == 'E'   )){
                    result += c;
            }
        }
        return result;
    }

                            // TASK 3 sumOfDigits()

    public static int sumOfDigits(String str) {
       int sum = 0;
      char[] c = str.toCharArray();
      for(int i = 0; i <= c.length-1; i++){
          if(Character.isDigit(c[i])){
              int a = Integer.parseInt(String.valueOf(c[i]));
                  sum = sum + a;
              }
          }

        return sum;
    }

                        // TASK 4 hasUpperCase()

    public static boolean hasUpperCase(String str) {
        boolean hasUpperCase = false;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                hasUpperCase = true;

            }
        }
        return hasUpperCase;
    }
                           // TASK 5 middleInt()

    public static int middleInt(int a, int b, int c){
        if(a > b && a < c) return a;
        if(b > a && b < c) return b;
        else return c;
    }

                            // TASK 6 no13()

    public static int[] no13(int[] arr){
        for(int i = 0; i <= arr.length -1; i++){
            if( arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }
                        // TASK 7  arrFactorial()

    public static int[] arrFactorial(int[] numbers){
        int[] arr = new int[numbers.length];
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            if (numbers[i] == 0 || numbers[i] == 1) arr[i] = 1;
            else{
                for (int j = 1; j <= numbers[i]; j++) {
                    temp *= j;
                }
                arr[i] = temp;
                temp = 1;
            }
        }
        return arr;
    }

                    // TASK 8 categorizeCharacters()
    public static String[] categorizeCharacters(String str) {
        String[] arr = new String[3];

        String letter = "";
        String digit = "";
        String special = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) letter += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) digit += str.charAt(i);
            else if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
                special += str.charAt(i);

            arr[0] = letter;
            arr[1] = digit;
            arr[2] = special;

        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(".............TASK 1 noDigits()..............");

        System.out.println(noDigit("123Hello")); // Hello
        System.out.println(noDigit("")); //""
        System.out.println(noDigit("Java")); //Java
        System.out.println(noDigit("123Hello World149")); // Hello World

        System.out.println("..........TASK 1 SECOND WAY removeDigits()..........");
        System.out.println(removeDigits("123Hello World149"));  // Hello World
        System.out.println(removeDigits("123Hello"));   // Hello World


        System.out.println(".............TASK 2 noVowel()..............");

        System.out.println(noVowel("")); //""
        System.out.println(noVowel("xyz")); //xyz
        System.out.println(noVowel("JAVA")); //JV
        System.out.println(noVowel("125$")); //125$
        System.out.println(noVowel("TechGlobal")); //TchGlbl

        System.out.println("......TASK 2 Second Way removeVowel()......");

        System.out.println(removeVowel("JAVA")); // JV
        System.out.println(removeVowel("xyz"));  // xyz
        System.out.println(removeVowel("TechGlobal"));  //TchGlbl

        System.out.println(".............TASK 3 sumOfDigits()..............");

        System.out.println(sumOfDigits(""));  // 0
        System.out.println(sumOfDigits("Java")); // 0
        System.out.println(sumOfDigits("John's age is 29")); // 11


        System.out.println(".............TASK 4 hasUpperCase()..............");

        System.out.println(hasUpperCase("")); // false
        System.out.println(hasUpperCase("java")); // false
        System.out.println(hasUpperCase("John's age is 29")); // true
        System.out.println(hasUpperCase("123")); // false

        System.out.println(".............TASK 5 middleInt()..............");
        System.out.println(middleInt(1, 1, 1)); // 1
        System.out.println(middleInt(2, 5, 7 )); // 5
        System.out.println(middleInt(-10, -5, -3)); // -5
        System.out.println(middleInt(5, 3, 5));  // 5
        System.out.println(middleInt(-1, 25, 10));  // 10


        System.out.println(".............TASK 6 no13()..............");

        System.out.println(Arrays.toString(no13(new int[] { 1, 2, 3, 4}))); // [1, 2, 3, 4]
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3}))); // [0, 2, 3]
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13, 13, 13}))); // [0, 0, 0, 0, 0]


        System.out.println(".............TASK 7 arrFactorial()..............");

        System.out.println(Arrays.toString(arrFactorial(new int[] {1, 2, 3, 4}))); // [1, 2, 6, 24]
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 2, 4 , 1}))); // [1, 2, 24, 1]
        System.out.println(Arrays.toString(arrFactorial(new int[]{5, 0, 6}))); // [120, 1, 720]

        System.out.println(".............TASK 8 categorizeCharacters()..............");

        System.out.println(Arrays.toString(categorizeCharacters("     "))); // [, , ]
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));  // [abc, 123, $#]
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));  // [abc, 123, $%]
    }
}