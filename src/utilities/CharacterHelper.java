package utilities;

public class CharacterHelper {

                                            // TASK 1

    public static boolean isSpace (char space) {
        return (space == 32);
    }


                                            // TASK 2

    public static boolean isDigit (char digit) {
        return (digit >= 48 && digit <= 57);
    }

                                            // TASK 3

    public static boolean isUppercase (char uppercase) {
        return (uppercase >= 65 && uppercase <= 90);
    }

                                            // TASK 4

    public static boolean isLowercase (char lowercase) {
        return (lowercase >= 97 && lowercase <= 122);
    }

                                            // TASK 5

    public static boolean isLetter (char letter) {
        // every Character which is UPPERCASE and LOWERCASE
        return (isUppercase(letter) ||  isLowercase(letter));

    }

                                           // TASK 6
    public static boolean isVowel (char vowel) {
        return (vowel == 97 || vowel == 101 || vowel == 105 || vowel == 111 || vowel == 117 ||
                vowel == 65 || vowel == 69 || vowel == 73 || vowel == 79 || vowel == 85 );
    }

                                          // TASK 7
    public static boolean isConsonant (char consonant) {
        // every LETTER which is NOT a VOWEL
        return (isLetter(consonant) && !isVowel(consonant));
    }







}
