package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        return number;
    }

    public static String getNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = scanner.nextLine();
        //scanner.nextLine();
        return firstName;
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scanner.nextLine();
        return str;

    }

    public static String getFavoriteBookFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite book");
        String favoriteBook = scanner.nextLine();
        return favoriteBook;
    }

    public static String getFavoriteQuoteFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite quote");
        String favoriteQuote = scanner.nextLine();
        return favoriteQuote;

    }

    public static String getAddressFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address");
        String getAddressFromUser = scanner.nextLine();
        return getAddressFromUser;
    }

    public static String getColorsFromUsers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite colors");
        String getColorsFromUser = scanner.nextLine();
        return getColorsFromUser;

    }

}