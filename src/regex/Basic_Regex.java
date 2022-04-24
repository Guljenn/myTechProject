package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");  // case sensitive
        Matcher matchers = pattern.matcher("I love techGlobal");

        System.out.println(matchers.matches()); // returns true or false and checks if given string matches given pattern

        while(matchers.find()){       // this will find the next matched pattern in the given string
            System.out.println(matchers.group()); // print out the matched pattern in the given string
            System.out.println("Start index " + matchers.start()); // returns int - prints out where found pattern starts
            System.out.println("End index " + matchers.end()); // prints out where the found pattern ends
        }

       // Pattern.matches("[xyz]”, “xyz”); // false Must be x y or z
       // Pattern.matches("[xyz]”, “xxxx”); // false Must be a single character
       // Pattern.matches("[xyz]”, “x”); // true
       // Pattern.matches("[^xyz]”, “y”);  // false Everything expect x y or z
        // Pattern.matches ("[^a-z]", "123"); // false There is more than 1 digit - it searches for 1 character or digit
    }
}
