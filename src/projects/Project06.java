package projects;

import javax.sound.midi.Soundbank;
import java.util.Scanner;



public class Project06 {
    public static void main(String[] args) {
        /*
        TASK-1
Write a program that asks user to enter a sentence as a String, and count
how many words that sentence has, and print it with given below message.

NOTE: Write a program that handles any String
NOTE: First check if the given sentence has 2 words at least. If not, then just
print “This sentence does not have multiple words”.

Test data 1:
Java is fun

Expected output 1:
This sentence has 3 words.

Test data 2:
Hello World

Expected output 2:
This sentence has 2 words.

Test data 3:
Hi

Expected output 3:
This sentence does not have multiple words
         */

        System.out.println("..................TASK1.....................");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String s = scan.nextLine().trim();
        int sum = 1;
        if (!(s.contains(" "))) {
            System.out.println("This sentence does not have multiple words");
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ')
                    sum++;
            }
            System.out.println("This sentence has " + sum + " words");
        }
        System.out.println("..................TASK2.....................");
                    /*
                   TASK-2
                    Write a program that asks user to enter a word, and check if it is palindrome
                    or not.
                    Palindrome: It is a word that is read the same backward as forward
                    •EX/ kayak, civic, madam
                    NOTE: Write a program that handles any String
                    NOTE: First check if the given String has at least 1 character, if the String
                    does not have at least one character, then print message “This word does
                    not have 1 or more characters
                     */

        System.out.println("Please enter a word");
        String word = scan.nextLine();
        String reverse = "";
        if (word.length() < 2) {
            System.out.println("This word does not have 1 or more characters");
        } else{
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (reverse.equals(word)) {
                System.out.println("This word is a palindrome");
            }else System.out.println("This word is not a palindrome");
        }





        System.out.println("..................TASK3.....................");


        System.out.println("Please enter a sentence");
        String s1 = scan.next().toLowerCase();
        int sum1 = 0;
        if (s1.length() < 1) {
            System.out.println("This sentence does not have any characters");
        } else
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'a') {
                    sum1++;
                }
            }
        System.out.println("This sentence has " + sum1 + " a or A letters.");


        System.out.println("..................TASK4.....................");

        System.out.println("Please enter a positive number");
        int number = scan.nextInt();
         scan.nextInt();
        for(int i = 1; i <= number; i++) {
            if (i % 6 == 0) {
                System.out.println("FooBar");

            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 3 == 0) {
                System.out.println("Bar");
            } else System.out.println(i);
        }
    }
}