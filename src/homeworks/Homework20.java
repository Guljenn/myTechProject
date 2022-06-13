package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Homework20 {


                                // TASK 1 -> hasLowerCase()
        public static boolean hasLowerCase(String str) {
            char[] c = str.toCharArray();

            for (char element : c) {
                if (Character.isLowerCase(element)) {
                    return true;
                }

            }
            return false;
        }

                            // TASK 2 -> noZero()

             public static ArrayList<Integer> noZero(ArrayList<Integer> number){
               ArrayList<Integer> noZeros = new ArrayList<>();
               for(int elements: number){
                   if(elements != 0)
                       noZeros.add(elements);
               }
                 return noZeros;
             }

                                // TASK 3 -> numberAndSquare()

            public static int[][] numberAndSquare(int[] arr){
                int[][] newList = new int[arr.length][2];
                for (int i = 0; i <= arr.length-1; i++) {
                    newList[i][0] = arr[i];
                    newList[i][1] = arr[i] * arr[i];
                }
                return newList;


            }

                                // TASK 4 -> containsValue()


                public static boolean containsValue(String[] arr, String str){
                    Arrays.sort(arr);
                    return Arrays.binarySearch(arr,str) >= 0;

    }

                                // TASK 5 -> reverseSentence()

            public static String reverseSentence(String str){
                String[] words = str.split(" ");
                String reverseWords = "";
                if(!str.contains(" ")) return "There is not enough words!";
                else
                    words[0] = (words[0].charAt(0) + "").toLowerCase() + words[0].substring(1);
                words[words.length - 1] = (words[words.length - 1].charAt(0) + "").toUpperCase() + words[words.length - 1].substring(1);

               for (int i = 0; i <= words.length-1; i++) {
                        reverseWords = words[i] + " " + reverseWords;
                    }
                return reverseWords;
            }

                            // TASK 6 -> removeStringsSpecialDigits()

            public static String removeStringsSpecialDigits(String str) {
               StringBuilder result = new StringBuilder();
               for(char c : str.toCharArray()){
                   if(Character.isWhitespace(c) || Character.isLetter(c)){
                       result.append(c);
                   }
               }
                return result.toString();
            }
                                // TASK 7 -> removeArraySpecialsDigits()

    public static String[] removeArraySpecialsDigits(String[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = arr[i].replaceAll("[^A-Za-z]", "");
        }
        return arr;
    }

                                // TASK 8 -> removeAndReturnCommons()

        public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2){
            ArrayList<String> duplicates = new ArrayList<>();
            for(int i = 0; i <= str1.size()-1; i++){
                for(int j = 0; j <= str2.size()-1; j++){
                    if(!duplicates.contains(str1.get(i)) && str1.get(i).equals(str2.get(j))) duplicates.add(str1.get(i));
                }
            }
            return duplicates;
        }


                            // TASK 9 -> noXInVariables()


        public static ArrayList<String> noXInVariables(ArrayList<String> str){
            ArrayList<String> newList = new ArrayList<>();

           for(String string : str){
               if(!string.equals("x")){
                   string = string.toLowerCase().replaceAll("x", "");
                   newList.add(string);
                }
            }
            return newList;
        }






    public static void main(String[] args) {

        System.out.println(".......... TASK 1 -> hasLowerCase().........");

        System.out.println(hasLowerCase(""));  // false
        System.out.println(hasLowerCase("JAVA"));  // false
        System.out.println(hasLowerCase("125$"));  // false
        System.out.println(hasLowerCase("hello")); // true

        System.out.println("\n.......... TASK 2 -> noZero().........\n");
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1)))); // [1]
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1, 1, 10)))); // [1, 1, 10]
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 1, 10)))); // [1, 10]
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 0, 0))));  // [ ]

        System.out.println("\n.......... TASK 3 -> numberAndSquare().........\n");

        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3}))); // [[1,1], [2, 4], [3,9]]
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6}))); // [[0, 0], [3, 9], [6, 36]]
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));    // [[1, 1], [4, 16]]

        System.out.println("\n.......... TASK 4 -> containsValue().........\n");

        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));  // false
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));     // false
        System.out.println(containsValue(new String[]{"abc", "def", "123", "java", "hello"}, "123"));  // true

        System.out.println("\n.......... TASK 5 -> reverseSentence().........\n");

        System.out.println(reverseSentence("Hello")); // There is not enough words!
        System.out.println(reverseSentence("Java is fun")); // Fun is java
        System.out.println(reverseSentence("This is a sentence"));  // Sentence a is this

        System.out.println("\n.......... TASK 6 -> removeStringsSpecialDigits().........\n");

        System.out.println(removeStringsSpecialDigits("123Java #$%is fun")); //Java is fun
        System.out.println(removeStringsSpecialDigits("Selenium"));  // Selenium
        System.out.println(removeStringsSpecialDigits("Selenium 123#$%Cypress"));  // Selenium Cypress


        System.out.println("\n.......... TASK 7 -> removeArraySpecialsDigits().........\n");

        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"}))); //[Java, is, fun]
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"}))); // [Selenium, , ]
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"}))); // [Selenium, Cypress]

        System.out.println("\n.......... TASK 8 -> removeAndReturnCommons().........\n");

        ArrayList<String> array1 = new ArrayList<>();
        array1.add("Java");
        array1.add("is");
        array1.add("fun");

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Java");
        array2.add("C#");
        array2.add("Python");
        System.out.println(removeAndReturnCommons(new ArrayList<>(array1), new ArrayList<>(array2)));

        System.out.println(".......... TASK 9 -> noXInVariables().........");

        ArrayList<String> noXList = new ArrayList<>();
        noXList.add("xyl");
        noXList.add("abc");
        noXList.add("123");

        System.out.println(noXInVariables(new ArrayList<>(noXList)));








    }

}
