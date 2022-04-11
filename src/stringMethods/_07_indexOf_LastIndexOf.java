package stringMethods;

public class _07_indexOf_LastIndexOf {
    public static void main(String[] args) {

        /*
         Method Task:They are used to find the index or last index of some char or String values in another String
        -They are non-static methods and called with another String object
        -They are return type, and they return int as index
        -They take either String or char as arguments

        NOTE: if the given char or String does not exist, then they return -1
        NOTE: if you are looking for an index of String, and it exists, it will return the first index of found match
        EXAMPLE: sentence.indexOf("Chicago"); // 7
         */



        String sentence = "I like Chicago and Miami more than any other cities";

        System.out.println(sentence.indexOf('C'));  //7
        System.out.println(sentence.indexOf('c'));  // 10
        System.out.println(sentence.lastIndexOf('c'));  // 45

        sentence.indexOf("Chicago"); //7
        sentence.indexOf("Miami"); // 19

        sentence.indexOf("chicago"); // because we don't have lowercase Chicago it will give an error -1
        System.out.println(sentence.indexOf("chicago")); // -1
        String name = "Banana";
        System.out.println(name.lastIndexOf("B"));

        String sentence2 = "I really like eating tacos and burgers!";

        System.out.println(sentence2.lastIndexOf("r"));
        System.out.println(sentence2.indexOf("r"));

        String name1 = "Guluzar";
        System.out.println(name1.indexOf('a'));






    }
}
