package collections;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        /*
        Create a list and store below data - countries
        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal
        */

        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germanu", "Portugal"};
        System.out.println("Way 1 converting Array to List");
        // WAY 1 to convert Array to List (ArrayList or LinkedList)
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));

        System.out.println("Way to of converting Array to List");
        // WAY 2 to convert Array to List (ArrayList or LinkedList
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries);
        Collections.addAll(countries4, countries);

        System.out.println("Way 3 of converting Array to List");
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> numbersList = new LinkedList<>();
        for( int i : numbers){
            numbersList.add(i);
        }
        System.out.println(numbersList);

    }
}
