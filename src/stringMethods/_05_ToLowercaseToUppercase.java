package stringMethods;

import utilities.ScannerHelper;

import java.util.Locale;

public class _05_ToLowercaseToUppercase {

    /*
     Method Task: These methods are used to convert letters of a String to uppercase or lowercase
        -They are non-static methods that you can call them with objects of String class
        -They are return type methods, and they return the modified String object back
        -They don't take any argument
     */

    public static void main(String[] args) {
        String st1 = "Hello world";
        System.out.println((st1)); // Hello world
        System.out.println(st1.toLowerCase());  // hello world
        System.out.println(st1.toUpperCase());  // HELLO WORLD

        System.out.println("I love you emre".toUpperCase());
    }
}
