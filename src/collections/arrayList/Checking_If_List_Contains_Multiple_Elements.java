package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Checking_If_List_Contains_Multiple_Elements {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(50);
        numbers.add(55);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);

           /*
        TASK-1
        Print true if the list has 5 as an element
        false otherwise

        RESULT:
        true
         */
        System.out.println(numbers.contains(5));


         /*
        TASK-2
        Print true if the list has 20 and 30 as elements
        false otherwise

        RESULT:
        false
         */

        System.out.println(numbers.contains(20) && numbers.contains(30));

         /*
        TASK-3
        Print true if the list has 30, 35, 40, 45, 50 as elements
        false otherwise

        RESULT:
        false
         */

        List<Integer> elementsToBeChecked = new ArrayList<>();
        elementsToBeChecked.add(30);
        elementsToBeChecked.add(35);
        elementsToBeChecked.add(40);
        elementsToBeChecked.add(45);
        elementsToBeChecked.add(50);

        System.out.println(numbers.containsAll(elementsToBeChecked));





    }
}
