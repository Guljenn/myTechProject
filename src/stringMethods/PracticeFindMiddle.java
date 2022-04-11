package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {


        String name = "Alona";
        System.out.println( "" + name.charAt(0) + name.charAt(2));

        System.out.println(StringHelper.getMiddle(name));

//        String name1 = "Taylor";
//        char first = name1.charAt(0);
//        char last = name1.charAt(name1.length()-1);
//        String middle = name1.charAt(name1.length()/2-1) + name1.charAt(name1.length()/2);
//        'y' + 'l' -> 229
//        yl
//        String name2 = "Alona";
//        char first = name2.charAt(0);
//        char last = name2.charAt(name2.length()-1);
//        char middle = name2.charAt(name2.length()/2);
//        Please print the middle character from the name
//        Alona 	-> o 	-> 2 	-> name.length()/2 -> 2
//        Guluzar -> u 	-> 3 	-> name.length()/2 -> 3
//        Ali 	-> l 	-> 1 	-> name.length()/2 -> 1
//        Taylor 	-> yl 	-> 2-3 	-> name.length()/2-1, name.length()/2
//        John 	-> oh 	-> 1-2  -> name.length()/2-1, name.length()/2
//        Mohammed-> am 	-> 3-4  -> name.length()/2-1, name.length()/2

    }
}
