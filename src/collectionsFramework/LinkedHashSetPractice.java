package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add("John");
      //  words.add("John"); Duplicates are not allowed
        System.out.println(words);
        words.iterator();
        System.out.println(words);
    }
}
