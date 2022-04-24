package collectionsFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map_Methods {

    public static void main(String[] args) {

        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        // keys: Day, Color, City, Car, Pet
        // value: friday, black, chicago, lexus, turtle

        Set<String> keys = favorites.keySet();  // [ Car, Color, City, Day, Pet]
        System.out.println(keys);

        Collection<String> values = favorites.values();  // [Friday, Black, Chicago, Friday, Turtle]
        System.out.println(values);

        System.out.println(values.stream().filter(element -> element.length() > 5).count());  // 5
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count()); // 3



    }
}
