package homeworks;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK1<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

            /*
            Requirement:
            -Create an ArrayList and store below numbers
            10, 23, 67, 23, 78
            THEN:
            -Print element at index of 3
            -Print element at index of 0
            -Print element at index of 2
            -Print the entire list
             */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        /*
                                Requirement:
                        -Create an ArrayList and store below colors
                        Blue, Brown, Red, White, Black, Purple
                        THEN:
                        -Print element at index of 1
                        -Print element at index of 3
                        -Print element at index of 5
                        -Print the entire list
         */

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK3<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        /*
                    Requirement:
            -Create an ArrayList and store below numbers
            23, -34, -56, 0, 89, 100
            THEN:
            -Print the entire list
            -Print the entire list sorted in ascending order
         */

        List<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(-34);
        number.add(-56);
        number.add(0);
        number.add(89);
        number.add(100);

        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK4<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            /*
                            Requirement:
                    -Create an ArrayList and store below cities
                    Istanbul, Berlin, Madrid, Paris
                    THEN:
                    -Print the entire list
                    -Print the entire list sorted lexicographically
                             */

        List<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK5<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        /*
                    Requirement:
            -Create an ArrayList and store Marvel characters below
            Spider Man, Iron Man, Black Panter, Deadpool, Captain
            America
            THEN:
            -Print the entire list
            -Then, check if it contains Wolwerine
            if it contains Wolwerine, then print true
            if it does not contain Wolwerine, print false
         */

        List<String> marvel = new ArrayList<>();
        marvel.add("Spider Man");
        marvel.add("Iron Man");
        marvel.add("Black Panther");
        marvel.add("Deadpool");
        marvel.add("Captain America");
        System.out.println(marvel);
        System.out.println(marvel.contains("Wolverine"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK6<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        /*
                            -Create an ArrayList and store Avengers
                    characters below
                    Hulk, Black Widow, Captain America, Iron Man
                    THEN:
                    -Print the entire list sorted lexicographically
                    -Then, check if it contains Hulk and Iron Man
                    if it contains both, then print true
                    if it does not contain both, print false
         */

        List<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK7<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

                                        /*
                                        Requirement:
                                -Create an ArrayList and store characters below
                                A, x, $, %, 9, *, +, F, G
                                THEN:
                                -Print the entire list
                                -Print each element
                                         */
        List<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');
        System.out.println(chars);
        for(char element : chars){
            System.out.println(element);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK8<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

                                    /*
                                    Requirement:
                            -Create an ArrayList and store below objects
                            Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
                            THEN:
                            -Print the entire list
                            -Print the entire list sorted lexicographically
                            -Count objects that starts with M or m
                            -Count objects that does not have A or a or E or e
                                     */

        List<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0;
        int countAE = 0;

        for (String element : objects) {
            if (element.toLowerCase().startsWith("m")) countM++;
            if (!element.toLowerCase().contains("a") && !element.toLowerCase().contains("e")) countAE++;
        }

        System.out.println(countM);
        System.out.println(countAE);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK9<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        /*
                                Requirement:
                        -Create an ArrayList and store below kitchen
                        objects
                        Plate, spoon, fork, Knife, cup, Mixer
                        THEN:
                        -Print the entire list
                        -Print how many elements starts with uppercase
                        -Print how many elements starts with lowercase
                        -Print how many elements has P or p
                        -Print how many elements starts or ends with P
                        or p
         */

        List<String> kitchenObjects = new ArrayList<>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");
        System.out.println(kitchenObjects);
        int upperCase = 0, lowerCase = 0, elementsHasP = 0, elementsStartsWithP = 0;
        for (String elements : kitchenObjects) {
            char c = elements.charAt(0);
            if (elements.toLowerCase().startsWith("p") || elements.toLowerCase().endsWith("p")) elementsStartsWithP++;
            if (elements.toLowerCase().contains("p")) elementsHasP++;
            if(Character.isUpperCase(c)) upperCase++;
            else lowerCase++;
        }
            System.out.println("Elements starts with uppercase = " + upperCase);
            System.out.println("Elements starts with lowercase = " + lowerCase);
            System.out.println(("Elements having P or p = " + elementsHasP));
            System.out.println("Elements starting or ending with P or p = " + elementsStartsWithP);


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>TASK10<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

                            /*
                            Requirement:
                    -Create an ArrayList and store below numbers
                    3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
                    THEN:
                    -Print the entire list
                    -Print how many element can be divided by 10
                    -Print how many even numbers are greater than
                    15
                    -Print how many odd numbers are less than 20
                    -Print how many elements are less than 15 or
                    greater than 50
                             */

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(7);
        numbers1.add(10);
        numbers1.add(0);
        numbers1.add(20);
        numbers1.add(17);
        numbers1.add(10);
        numbers1.add(23);
        numbers1.add(56);
        numbers1.add(78);
        System.out.println(numbers1);

        int countNumbersDividedBy10 = 0, evenNumbersGreaterThan15 = 0, oddNumbersLessThan20 = 0, elementsLessThan15GreaterThan50 =0;

        for(int element : numbers1){
            if(element % 10 == 0) countNumbersDividedBy10++;
            else if(element % 2 == 1 && element < 20) oddNumbersLessThan20++;
            if(element % 2 == 0 && element > 15) evenNumbersGreaterThan15++;
            if(element < 15 || element > 50) elementsLessThan15GreaterThan50++;

        }
        System.out.println("Elements that can be divided by 10 = " + countNumbersDividedBy10);
        System.out.println( "Elements that are even and greater than 15 = " + evenNumbersGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddNumbersLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + elementsLessThan15GreaterThan50);

    }
}