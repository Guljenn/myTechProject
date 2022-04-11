package collections.arrayList;

import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        /*
        TASK 1
        Remove Python from the list and print it
         */
        languages.remove("Python");
        System.out.println(languages);

        /*
        TASK 2
        Remove all elements that start with J


         */
        List<String> elementsStartWithJ = new LinkedList<>();
        for (String language : languages) {
            if (language.startsWith("J")) elementsStartWithJ.add(language);
        }

            languages.removeAll(elementsStartWithJ);
            System.out.println(languages);

        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);


    }


}