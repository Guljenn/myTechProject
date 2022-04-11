package homeworks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkQuestions {
    public static void main(String[] args) {
        /*
        Requirement:
Write a program to find the first duplicated String in a String array, ignore
cases. It should print “There is no duplicates” if there are no duplicate
elements.
NOTE: Make your code dynamic that works for any given String array.
Test data 1:
String[] words = {“Z”, “abc”, “z”, “123”, “#” };


         */

        System.out.println("HOMEWORK 14 TASK 2");
        String[] words = {"Z", "abc", "z", "123", "#", "z" };
        boolean isDuplicate = false;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i +1; j < words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    System.out.println(words[i]);
                    isDuplicate = true; break;

                }

            }
            if(isDuplicate)break;
        }
        if(!isDuplicate) System.out.println("There is no duplicate");

        System.out.println("HOMEWORK 14 TASK 3");
        /*
        Requirement:
Write a program to find the all duplicates in an int array. It
should print “There is no duplicates” if there are no
duplicate elements.
NOTE: Make your code dynamic that works for any given
int array.
Test data 1:
int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0
         */
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};
       String s = "";
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j] && !s.contains(numbers[i] + "")){
                    s += numbers[i];
                    System.out.println(numbers[i]);
                    break;
                }
            }

        }
        if(s.isEmpty()) System.out.println("There is no duplicates");

        System.out.println("SOLUTION 2 FOR HOMEWORK 14 TASK 3");

        int[] numbers1 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < numbers1.length; i++){
            for(int j = i + 1; j < numbers1.length; j++){
                if(numbers1[i] == numbers1[j] && !newList.contains(numbers1[i])) {
                    newList.add(numbers1[i]);
                    System.out.println(numbers1[i]);
                }
            }
        }
        if(newList.isEmpty()) System.out.println("There are no duplicates");

        System.out.println("HOMEWORK 14 TASK 5");
/*
Requirement:
Write a program to reverse elements in an array, then
print array.
NOTE: Make your code dynamic that works for any
given array.
Test data 1:
String[] words1 = {“abc”, “foo”, “bar”
 */

        String[] words1 = {"abc", "foo", "bar"};

        for (int i = words1.length-1; i >= 0; i --){
            System.out.print("{" + words1[i] + "}, ");
        }
        String str = "      Java is fun       ";
        String str1 = str.trim();
        int countspaces = 0;
       for(char c : str1.toCharArray()){
           if(c == ' ' ) countspaces++;

        }

        System.out.println("\n" + countspaces + 1);

       String str4 = "";

       for(int i = 0; i < str4.length(); i++){
           if(str4.isEmpty())
               System.out.println("This string does not have letters");

       }


    }
}