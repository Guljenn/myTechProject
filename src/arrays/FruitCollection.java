package arrays;

import java.util.Arrays;

public class FruitCollection {
    public static void main(String[] args) {

        /*
        Create an Array that will store 4 fruit names.
         */
        String[] fruit = new String[4];
        System.out.println(Arrays.toString(fruit));

       fruit [0] = "kiwi";
       fruit [3] = "strawberry";

        System.out.println(Arrays.toString(fruit));

        //how to find a size in an array

        System.out.println(fruit.length);

        //Print the elements at the index of 0 and 3

        System.out.println(fruit[0]);
        System.out.println(fruit[3]);
        //print something that does not have an index
        System.out.println(fruit[1]);








    }
}
