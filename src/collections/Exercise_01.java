package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_01 {
    public static void main(String[] args) {
        /*
        Create a list to store below
        Berlin
        Chicago
        Dallas
        Miami
        Brugge
        Kiev
        Print the list and then remove Miami and Dallas and Print the List again
         */

        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> cities1 = new ArrayList<>(Arrays.asList(cities));
        System.out.println(cities1);
        cities1.remove("Miami");
        cities1.remove("Dallas");
        System.out.println(cities1);





    }
}
