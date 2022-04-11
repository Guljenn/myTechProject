package arrays;

import utilities.CharacterHelper;

import java.util.Arrays;

public class _01_Practice_CharArray {
    public static void main(String[] args) {

        /*
        Creat a char array to score values below
        #
        $
        5
        A
        b
        H
        Print the array
         */
        String s = "";
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};

        System.out.println(Arrays.toString(chars));

        // TASK 2
        // PRINT OUT THE MESSAGE : THE SIZE OF THE ARRAYS IS 6

        System.out.println("The size of the arrays is = " + chars.length);

        // TASK 3
        // PRINT EACH ELEMENT USING FORi LOOP

        for (char i = 0; i <= chars.length - 1; i++) {
            System.out.println(chars[i]);
        }

        // TASK 4
        // PRINT EACH ELEMENT USING FOR EACH LOOP

        for (int element : chars) {
            System.out.println((char) element);
        }

        // TASK 5

        // PRINT EACH LETTERS THAT ARE ELEMENTS

        for (char elements : chars) {
            if (CharacterHelper.isLetter(elements))
                System.out.println(elements);

        }

        // TASK 6
        //count uppercase characters

        int count = 0;

        for (char elements : chars) {
            if (CharacterHelper.isUppercase(elements))
                count++;

        }
        System.out.println(count);

        //  task 6 for i loop
        int countUpper = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) countUpper++;

        }  System.out.println(countUpper);

        // TASK 7 IF CHARACTER IS LOWER CASE
        int countLower = 0;
        for(int i = 0; i <= chars.length-1; i++){
            if(CharacterHelper.isLowercase(chars[i])) countLower++;

        } System.out.println(countLower);

                        //TASK 8 COUNT DIGITS
        int countDigit = 0;
          for(char element : chars){
              if(Character.isDigit(element)){
                 countDigit++;

              }
          }
        System.out.println(countDigit);
    }
}