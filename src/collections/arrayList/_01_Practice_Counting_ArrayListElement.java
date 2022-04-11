package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayListElement {
    public static void main(String[] args) {

        /*
        Create an arraylist that stores below numbers
        10
        12
        13
        8
        9
        15
        Print the list
         */

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);

        /*
        count how many odd numbers you have in the list and print
         */
        int count = 0;
        for(int element : numbers){
            if(element % 2 != 0){
                count++;
            }
        }
        System.out.println("Odds = " + count);

        // SAME TASK DONE WITH FOR I LOOP
        int count1 = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 1){
                count1++;
            }
        }
        System.out.println("Odds = " + count1);


        /*
        PRACTICE
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        /*
        TASK 3
        Create a List called colors that store below elements
        Purple
        Yellow
        blue
        red
        Brown
        Black
        White
         */
        List<String> colors = new ArrayList<>();

        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");

        System.out.println(colors);


        /*
        TASK 4
        count how many colors in the list start with Uppercase
         */

        int countUpper = 0;

        for(String element : colors){
            if(Character.isUpperCase(element.charAt(0))){
                countUpper++;

            }
        }
        System.out.println(countUpper);

        //SAME TASK WITH FOR I LOOP
        int countUppers = 0;
        for(int i = 0; i < colors.size(); i++){
            if(Character.isUpperCase(colors.get(i).charAt(0))) countUppers++;
        }

        System.out.println(countUppers);

        /*
        PRACTICES
        Lowercase
        nulls
        empties
        length of at least 4
        Even lengths or Odd lengths
        Count the ones that have a or A
         */
        int countAtLeast4 = 0;
        for(String element : colors){
            if(element.length() >= 4){
                countAtLeast4++;
            }
        }
        System.out.println(countAtLeast4);

        int countEvens = 0;

        for(String element : colors){
            if(element.length() % 2 == 0) countEvens++;
        }

        System.out.println(countEvens);

        int countA = 0;
        for(String element : colors){
            if(element.toLowerCase().contains("a")){
                countA++;
            }
        }
        System.out.println(countA);
    }

}
