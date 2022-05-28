package collections_Practice;

import java.util.*;

public class ArrayList_Practice {
    public static void main(String[] args) {


        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        Integer numbers = Collections.min(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("Adrian");
        names.add("Bahar");
        names.add("Cindy");
        names.add("Aaron");

        String name = Collections.max(names);
        System.out.println(name);



    }
}
