package methods;

import utilities.CharacterHelper;

public class FindIfCharacterIsSpace {
    public static void main(String[] args) {


           char ch = 32;

            if(CharacterHelper.isSpace(ch)) {
                System.out.println("True");
            }else System.out.println("false");
    }

}



