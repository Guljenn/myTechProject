package homeworks;




public class Homework10 {
    public static void main(String[] args) {


        System.out.println(">>>>>>>>>>>>>>>TASK1<<<<<<<<<<<<<<<<<<");

        String word = "fl";

        if (word.length() >= 1) {
            System.out.println("Length is = " + word.length());
            System.out.println("First char is = " + word.charAt(0));
            System.out.println("last char is = " + word.charAt(word.length() - 1));
        }
        if (word.toLowerCase().contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
            System.out.println("This String has vowels");
        } else if (word.length() < 1) {
            System.out.println("Length is zero");
        } else System.out.println("This String does not have any vowels");

        System.out.println(">>>>>>>>>>>>>>>TASK2<<<<<<<<<<<<<<<<<<");


        String word2 = "Apple";

        if (word2.length() < 3) {
            System.out.println("Length is less than 3");
        } else if (word2.length() % 2 == 0) {
            System.out.println(word2.charAt(word2.length() / 2 - 1) + "" + word2.charAt(word2.length() / 2));
        } else
            System.out.println(word2.charAt(word2.length() / 2));

        System.out.println(">>>>>>>>>>>>>>>TASK3<<<<<<<<<<<<<<<<<<");

        String word3 = "telephone";
        if (word3.length() >= 4) {
            System.out.println(word3.substring(0, 2));
            System.out.println(word3.charAt(word3.length() - 2) + "" + word3.charAt(word3.length() - 1));
            System.out.println(word3.substring(2, word3.length() - 2));
        } else System.out.println("INVALID INPUT");

        System.out.println(">>>>>>>>>>>>>>>TASK4<<<<<<<<<<<<<<<<<<");

        String word4 = "abba";

        if (word4.length() < 2) {
            System.out.println("length is less than 2");
        }
        else{
            System.out.println(word4.charAt(0) == word4.charAt(word4.length() - 1) && word4.charAt(1) == word4.charAt(word4.length() - 2));
        }



            System.out.println(">>>>>>>>>>>>>>>TASK5<<<<<<<<<<<<<<<<<<");

            String str1 = "Post";
            String str2 = "Malone";
            // when both strings have only 2 characters, nothing prints.
            if (str1.length() < 2 || str2.length() < 2) {
                System.out.println("INVALID INPUT");
            } else {
                System.out.println(str1.substring(1, str1.length() - 1) + str2.substring(1, str2.length() - 1));
            }
            System.out.println(">>>>>>>>>>>>>>>TASK6<<<<<<<<<<<<<<<<<<");


            String word5 = "hamburger";
            String result = word5.toLowerCase();

            if (result.length() < 4) {
                System.out.println("INVALID INPUT");
            } else if ((result.charAt(0) == 'x' && result.charAt(1) == 'x'
                    && result.charAt(result.length() - 1) == 'x'
                    && result.charAt(result.length() - 2) == 'x')) {
                System.out.println("true");
            } else System.out.println("false");


        }
    }
