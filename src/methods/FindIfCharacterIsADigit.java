package methods;

import utilities.CharacterHelper;

public class FindIfCharacterIsADigit {
    public static void main(String[] args) {

        char digit = 55;

        if(CharacterHelper.isDigit(digit)) {
            System.out.println("True");

        } else System.out.println("False");
    }
}
