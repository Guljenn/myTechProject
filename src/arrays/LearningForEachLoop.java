package arrays;

import java.util.Arrays;

public class LearningForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};

        System.out.println("Element 1 = " + chars[0]);
        System.out.println("Element 2 = " + chars[1]);
        System.out.println("Element 3 = " + chars[2]);
        System.out.println("Element 4 = " + chars[3]);
        System.out.println("Element 5 = " + chars[4]);
        System.out.println("Element 6 = " + chars[5]);
        System.out.println("Element 7 = " + chars[6]);


        for (int i = 0; i <= chars.length-1; i++)
        System.out.println("Element  = " + chars[i]);


        // FOR EACH LOOP

        for(char element: chars)
            System.out.println("Elements = " + element);


    }
}