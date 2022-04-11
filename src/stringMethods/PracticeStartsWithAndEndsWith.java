package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {

        String name = ScannerHelper.getNameFromUser();
    if(name.startsWith("a") || name.startsWith("A")) {
        System.out.println("You are in the club A");
    }
    else {
        System.out.println("You are not in the A club");
    }


    }
}
