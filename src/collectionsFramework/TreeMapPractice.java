package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {


        TreeMap<String, Integer> studentAges = new TreeMap<>();
        studentAges.put("Kaly", 17);
        studentAges.put("Tori", 20);
        studentAges.put("Alona", 15);
        studentAges.put("andrei", 25);
      //  studentAges.put(null, 15);  // NullPointerExpection
        studentAges.put("Guluzar", null);
        studentAges.put("Melda", null);

        System.out.println(studentAges);
    }
}