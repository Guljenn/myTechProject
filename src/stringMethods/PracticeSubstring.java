package stringMethods;

import utilities.ScannerHelper;

public class PracticeSubstring {
    public static void main(String[] args) {

        String sentence = ScannerHelper.getStringFromUser();
        System.out.println("First word is = " +  sentence.substring(0, sentence.indexOf(' ')));
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ')+1));


    }
}
