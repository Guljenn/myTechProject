package methods;

import utilities.CharacterHelper;

public class FindIfCharacterIsUppercase {
    public static void main(String[] args) {


        char letter = 101;

        if(CharacterHelper.isUppercase(letter)) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
