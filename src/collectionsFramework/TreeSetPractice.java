package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        //Treeset does not allow duplicates, and it does not preserve the order, it implicitly sorts

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
     //   numbers.add(null); does not allow null
        System.out.println(numbers); //[1, 2, 3, 5]
        TreeSet<String> words = new TreeSet<>();
        words.add("Adrian");
        words.add("Guluzar");
        words.add("Kaly");
        words.add("Alona");
        words.add("cassy");
        System.out.println(words); //[ Adrian, Alona, Guluzar, Kaly, cassy]


    }
}
