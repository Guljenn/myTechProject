package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project08 {

                            /*
                            TASK-1 - countMultipleWords() method
                             */


    public static int countMultipleWords(String[] str){
        int count = 0;
        for(String elements : str)
            if(elements.trim().contains(" ")) count++;

        return count;
    }

                        /*
                        TASK-2 - removeNegatives() method
                         */

    public static List<Integer> removeNegative(List<Integer> arr){
       arr.removeIf(element -> element < 0);
        return arr;
    }

                                    /*
                                    TASK-3 - validatePassword() method
                                •Write a method that takes a “String password” as an argument and
                                checks if the given password is valid or not
                                •This method will return true if given password is valid, or false if given
                                password is not valid
                                •A VALID PASSWORD:
                                -should have length of 8 to 16 (length of 7 or 17 should return false)
                                -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
                                char
                                -should NOT have any space
                                Test data 1:
                                Expected output 1:
                                false
                                Test data 2:
                                abcd
                                Expected output 2:
                                false
                                Test data 3:
                                abcd1234
                                Expected output 3:
                                false
                                Test data 4:
                                Abcd1234
                                Expected output 4:
                                false
                                Test data 5:
                                Abcd123!
                                Expected output 5:
                                true
                                     */
    public static boolean validatePassword(String password) {
        boolean isValid = false;
       if(password.length() >=8 && password.length() <= 16 && !password.contains(" "))
           return !isValid;
       return password.contains("(.*[A-Z].*)") && password.contains("(.*[a-z].*)") && password.contains("(.*[0-9].*)") &&
          password.contains("(.*[@,#,$,%].*$)");

    }
                            //TASK4  validateEmailAddress() method

    public static boolean validEMail(String email) {
        if (email.contains(" ")) return false;
        if (email.contains("@") && email.contains(".")) {
            String[] split1 = email.split("@");
            String[] split2 = split1[1].split("\\.");
            return split1[0].length() > 2 && split2[0].length() > 2 && split2[1].length() > 2;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println("........................TEST TASK 1.................................");
        String[] words = {"foo", "", " ", "foo bar", "java is fun", " ruby "};

        System.out.println(countMultipleWords(words));

        System.out.println("........................TEST TASK 2.................................");

                    List<Integer> numbers = new ArrayList<>();   //[2, -5, 6, 7, -10, -78, 0, 15]
                    numbers.add(2);
                    numbers.add(-5);
                    numbers.add(6);
                    numbers.add(7);
                    numbers.add(-10);
                    numbers.add(-78);
                    numbers.add(0);
                    numbers.add(15);
        System.out.println(removeNegative(numbers));

        System.out.println("........................TEST TASK 3.................................");

        String password = "Abcd123!";

        System.out.println(validatePassword(password));

        System.out.println("........................TEST TASK 4.................................");


        String email = "abcd@gmail.com";
        System.out.println(validEMail(email));

    }
}
