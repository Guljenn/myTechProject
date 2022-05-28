package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {
        /*
TASK-1
Write a program that counts spaces for below String
String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

Expected result:
9
 */


        System.out.println("\n---TASK-1---\n");
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int space = 0;
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
        System.out.println("Total white space : " + space);

         /*
        TASK-2
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */

        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count2 = 0;
        for (int i = 0; i < address.length(); i++) {
            char letters = address1.charAt(i);
            if (Character.isLetter(address1.charAt(i))) ;
            count2++;
        }
        System.out.println(count2);

                                /*
                        TASK-3
                        Write a program that counts uppercase and lowercase letters for below String.
                        Then, find the difference between lowercase letters and uppercase letters
                        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters


                        Expected result:
                        9
                         */
        String address3 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int counts = 0;
        for (int i = 0; i < address3.length(); i++) {
            char chc = address3.charAt(i);
            if (Character.isUpperCase(chc)) {
                counts++;
            } else if (Character.isLowerCase(chc)) {
                counts--;

            }
        }
        System.out.println(Math.abs(counts));


        /*
TASK-4
Write a program that counts vowel and consonants letters for below String.
Then, print them with below messages

String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

Expected result:
Vowels = 10
Consonants = 15
 */


        String address4 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int counts1 = 0;
        int countss = 0;
        for (int i = 0; i < address4.length(); i++) {
            char c = address4.charAt(i);
            if (CharacterHelper.isVowel(c)) {
                counts1++;

            } else if (CharacterHelper.isConsonant(c)) {
                countss++;

            }
        }
        System.out.println("vowels = " + counts1);
        System.out.println("Consonants = " + countss);

                /*
                TASK-5 - Putting all together
                Write a program that characters from the below String.
                Then, print them with below messages



                Expected result:
                Letters = 25
                Lowercases = 17
                Uppercases = 8
                Vowels = 10
                Consonants = 16
                Digits = 12
                Spaces = 9
                Specials = 2
                 */


        String address5 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int countl = 0, countLower = 0, countU = 0, countV = 0, countC = 0, countD = 0, countS = 0, countSP = 0;


        for (int i = 0; i < address5.length(); i++) {
              char chh = address5.charAt(i);
            if(Character.isLetter(chh)){
                countl++;
                System.out.println("Letters = " + countl );

            }else if(Character.isLowerCase(chh)){
                countLower++;
                System.out.println("Lowercase = " + countLower);

            }else if(Character.isUpperCase(chh)){
                countU++;

            }


        }

    }
}


