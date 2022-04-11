package collections.arrayList;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers.size());
        System.out.println(numbers);

//        for (i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

        // for each loop
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
