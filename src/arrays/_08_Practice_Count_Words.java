package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        Assume you are given a String as below
        Please find how many words you have in the given String
         */

        String s1 = "Today is Tuesday";
        String[] sen = s1.split(" ");

        System.out.println(sen.length);

        /*
        Find how many words you have in the given string starts with A or a
         */

        String[] words = "Some countries I visited were Argentina, Belgium and Malta".split(" ");
        int count1 = 0;
        for (String s : words) {
            if (s.toLowerCase().startsWith("a")) {
                count1++;
            }

        }
        System.out.println(count1);
    }
}