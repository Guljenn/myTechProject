package loops;

import utilities.ScannerHelper;

public class ReversedString {
    public static void main(String[] args) {

        /*
        Write a program that gets a name from user.
        Reverse the name and printed back
         */
        String reversedName = "";
        String name = ScannerHelper.getNameFromUser();
        for(int i = name.length()-1; i >= 0; i--){
            reversedName += name.charAt(i);

        }
        System.out.println("The reversed name is " + reversedName);
        System.out.println("The reversed name to uppercase is " + reversedName.toUpperCase());
    }
}
