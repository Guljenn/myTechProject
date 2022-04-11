package homeworks;

public class ValidateAStringAsAPassword {
    /*
   Write a method that takes a String and returns true or false
   Check if it has length of 8-16
   Has at least one uppercase letter
   Has at least one lowercase letter
   Has at least one digit
   Has at least one special
   It should not have space

   TEST DATA:
   Abcd123!

   EXPECTED OUTPUT:
   true
    */

    //Solution without regex
    public static boolean validatePassword(String str){
        if(str.contains(" ") || str.length() < 8 || str.length() > 16) return false;

        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;

        for(char c: str.toCharArray()){
            if(Character.isUpperCase(c)) uppercase = true;
            else if(Character.isLowerCase(c)) lowercase = true;
            else if(Character.isDigit(c)) digit = true;
            else special = true;
        }

        return uppercase && lowercase && digit && special;
    }

    //Testing method
    public static void main(String[] args) {
        System.out.println(validatePassword("")); // false
        System.out.println(validatePassword("abc")); // false
        System.out.println(validatePassword("Abcd1234")); // false
        System.out.println(validatePassword("Abc12$")); // false
        System.out.println(validatePassword("Abc d512$")); // false
        System.out.println(validatePassword("Abcd512$abcdefdabc")); // false
        System.out.println(validatePassword("Abcd123!")); // true
    }
}



















