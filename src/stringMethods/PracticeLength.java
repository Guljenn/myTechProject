package stringMethods;

import utilities.ScannerHelper;

public class PracticeLength {
    public static void main(String[] args) {

        String favoriteBook = ScannerHelper.getFavoriteBookFromUser();
        String favoriteQuote = ScannerHelper.getFavoriteQuoteFromUser();

        System.out.println("The number of characters in" + favoriteBook + " is " + favoriteBook.length());
        System.out.println("The number of characters in" + favoriteQuote + " is " + favoriteQuote.length());

    }
}
