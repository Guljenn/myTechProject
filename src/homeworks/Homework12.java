package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static <Char> void main(String[] args) {

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 1>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int[] numbers = new int[10];
        numbers[0] = 89;
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[6] = 15;
        numbers[7] = 34;
        numbers[9] = 7;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 2>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";

        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 3>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int[] number = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 4>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 5>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs));

        boolean isPluto = false;

        for (String dog : dogs) {
            if (dog.equals("Pluto")) {
                isPluto = true;
                break;

            }
        }
        System.out.println(isPluto);

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 6>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.binarySearch(cats, "Garfield") >= 0 && Arrays.binarySearch(cats, "Felix") >= 0);


        System.out.println(">>>>>>>>>>>>>>>>>>TASK 7>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        double[] doubles = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubles));
        System.out.println(doubles[0]);
        System.out.println(doubles[1]);
        System.out.println(doubles[2]);
        System.out.println(doubles[3]);
        System.out.println(doubles[4]);

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 8>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        /*
        Requirement:
-Create a char array that stores characters below
A, b, G, H, 7, 5, &, *, e, @, 4
THEN:
-Print the entire array
-Print the total count of the letters
-Print the total count of lowercase letters
-Print the total count of uppercase letters
-Print the total count of digits
-Print the total count of special characters
Expected Result:
[A, b, G, H, 7, 5, &, *, e, @, 4]
Letters = 5
Uppercase letters = 3
Lowercase letters = 2
Digits = 3
Special characters = 3
         */
        int countL = 0, countUpper = 0, countLower = 0, countD = 0, countSC = 0;
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(characters));
        for (char c : characters) {
            if (Character.isLetter(c)) {
                countL++;
                if (CharacterHelper.isUppercase(c))
                    countUpper++;
                else // (Character.isLowerCase(c))
                    countLower++;
            } else if (Character.isDigit(c)) countD++;
            else countSC++;
        }
        System.out.println("Letters = " + countL);
        System.out.println("Uppercase Letters  = " + countUpper);
        System.out.println("Lowercase Letters  = " + countLower);
        System.out.println("Digits  = " + countD);
        System.out.println("Special Characters  = " + countSC);


        System.out.println(">>>>>>>>>>>>>>>>>>TASK 9>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String[] words = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        int countUp = 0, countLow = 0, countBOrP = 0, countBookOrPen = 0;
        System.out.println(Arrays.toString(words));
        for (String w : words) {
            if (w.toLowerCase().startsWith("b") || (w.toLowerCase().startsWith("p"))) {
                countBOrP++;
            }
            if (w.toLowerCase().contains("book") || (w.toLowerCase().contains("pen")))
                countBookOrPen++;

            if (Character.isUpperCase(w.charAt(0))) {
                countUp++;
            } else countLow++;

        }
        System.out.println("Elements starts with Uppercase = " + countUp);
        System.out.println("Elements starts with lowercase = " + countLow);
        System.out.println("Elements starting with B or P = " + countBOrP);
        System.out.println("Elements having \"book\" or \"pen\"  = " + countBookOrPen);


        System.out.println(">>>>>>>>>>>>>>>>>>TASK 10>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int countMoreThan10 = 0, countLessThan10 = 0, countEqualTo10 = 0;
        int[] num = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(num));
        for (int n : num) {
            if (n > 10) countMoreThan10++;
            else if (n < 10) countLessThan10++;
            else countEqualTo10++;


        }
        System.out.println("Elements that are more than 10 = " + countMoreThan10);
        System.out.println("Elements that are less than 10 = " + countLessThan10);
        System.out.println("Elements that are 10 = " + countEqualTo10);

        System.out.println(">>>>>>>>>>>>>>>>>>TASK 11>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        /*
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0
        THEN:
        -Print both arrays
        –Then, create a new array called that will take
        greatest of same index from first 2 arrays
        -Print third array as well
        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2]
         */

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[5];

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));


        for (int i = 0; i < third.length; i++) {
            third[i] = Math.max(first[i], second[i]);
        }
        System.out.println(Arrays.toString(third));
    }
}
