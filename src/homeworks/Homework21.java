package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework21 {


    public static boolean hasLowerCase(String str) {

        for (char word : str.toCharArray())
            if (Character.isLowerCase(word)) return true;

        return false;
    }


    public static ArrayList<Integer> noZero(ArrayList<Integer> number) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i <= number.size() - 1; i++) {
            if (number.get(i) != 0) newList.add(number.get(i));
        }
        return newList;
    }

        public static int[][] numberAndSquare(int[] arr){
            int[][] newList = new int[arr.length][2];
            for(int i = 0; i <= arr.length-1; i++){
                newList[i][0] = arr[i];
                newList[i][1] = arr[i] * arr[i];
            }
            return newList;
        }

    public static boolean containsValue(String[] str, String str1){
        Arrays.sort(str);


        return Arrays.binarySearch(str, str1) > 0;
    }
    public static String reverseSentence(String str){
        String[] words = str.split(" "); // splitting each word in the array
        if(words.length < 2) return "Invalid!";
        else
            words[0] = (words[0].charAt(0) + "").toLowerCase() + words[0].substring(1);
        words[words.length-1] = (words[words.length-1].charAt(0) + "").toUpperCase() + words[words.length-1].substring(1);
        String reverse = "";

        for(int i = words.length-1; i >= 0; i--)
            reverse += words[i] + " ";

        return reverse;
    }

    public static String removeStringSpecialsDigits(String str){

                String word = "";
        for(int i = 0; i <= str.length()-1; i++){
            if(Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))) {
                        word += str.charAt(i);
            }
        }

        return word;
    }



    public static String[] removeArraySpecialDigits(String[] arr){
        for(int i = 0; i <= arr.length-1;i++)
            arr[i] = arr[i].replaceAll("[^A-Za-z]", "");

        return arr;
    }


    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2){

       ArrayList<String> duplicates = new ArrayList<>();
       for(int i = 0; i <= str1.size()-1; i++){
           for(int j = 0; j <= str2.size()-1; j++){
               if(!duplicates.contains(str1.get(i)) && str1.get(i).equals(str2.get(j))) duplicates.add(str1.get(i));
           }
       }
        return duplicates;
    }
                    /*
                    Requirement:
                -Create a method called noXInVariables()
                -This method will take an ArrayList argument, and it will
                return an ArrayList with all the x or X removed from
                elements.
                If the element itself equals to x or X or contains only x
                letters, then remove that element.
                NOTE: Assume that ArrayList size is at least 1.
                Test Data 1: [abc, 123, #$%]
                Expected Result 1: [abc, 123, #$%]
                Test Data 2: [xyz, 123, #$%]
                Expected Result 2: [yz, 123, #$%]
                Test Data 3: [x, 123, #$%]
                Expected Result 3: [123, #$%]
                Test Data 4: [xyXyxy, Xx, ABC]
                Expected Result 4: [yyy, ABC]
                     */
    public static ArrayList<String> noXInVariables(ArrayList<String> str){
        ArrayList<String> noXList = new ArrayList<>();
        for(int i = 0; i <= str.size()-1; i++){
           // i = str.get(i).toLowerCase().replaceAll("[Xx]", " ");
             noXList.add(str.get(i));
        }
        return noXList;
    }



    public static void main(String[] args) {
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("java"));

        System.out.println(noZero(new ArrayList<>(Arrays.asList(1, 3, 0))));

        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1,3,4})));

        System.out.println(reverseSentence("Java is fun"));
        System.out.println(removeStringSpecialsDigits("I love you &&"));

        System.out.println(Arrays.toString(removeArraySpecialDigits(new String[]{"123Java", "#$%is", "fun"})));



      // System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "C#")), new ArrayList<>(Arrays.asList("Python, C#", "C++"))));

        ArrayList<String> array1 = new ArrayList<>();
        array1.add("Java");
        array1.add("C#");
        array1.add("C#");

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Python");
        array2.add("C#");
        array2.add("C++");
        System.out.println(removeAndReturnCommons(new ArrayList<>(array1), new ArrayList<>(array2)));

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Java");
        s1.add("C#");
        s1.add("C#");

        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Python");
        s2.add("C#");
        s2.add("C++");
        System.out.println(removeAndReturnCommons(new ArrayList<>(s1), new ArrayList<>(s2)));

        ArrayList<String> noXList = new ArrayList<>();
        noXList.add("xyl");
        noXList.add("abc");
        noXList.add("123");

        System.out.println(noXInVariables(new ArrayList<>(noXList)));

        ArrayList<String> list = new ArrayList<>();
        list.add("xyXyxy");
        list.add("Xx");
        list.add("ABC");
        System.out.println(noXInVariables(new ArrayList<>(list)));
    }
        }
