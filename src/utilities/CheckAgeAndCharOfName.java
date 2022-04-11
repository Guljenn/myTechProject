package utilities;

public class CheckAgeAndCharOfName {


    public static void checkAgeAndLetter(int age, String name) {
        if (age > 30 && CharacterHelper.isUppercase(name.charAt(0))) {
            System.out.println("Age and letter checks out");
        } else if (age > 30 && CharacterHelper.isLowercase(name.charAt(0))) {
            System.out.println("Age checks out but letter doesn't");
        } else if (age <= 30 && CharacterHelper.isUppercase(name.charAt(0))) {
            System.out.println("Age doesn't check out but letter does");
        } else {
            System.out.println("Nothing checks out");
        }


    }
}
