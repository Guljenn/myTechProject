package practice;

import methods.FindIfCharacterIsUppercase;
import utilities.CharacterHelper;

public class IfElsePractice {
    public static void main(String[] args) {
//        Create a method which will take an int as ang argument and returns a String.
//        If the int number is in between -50/ 0 return "The number is negative"
//        If the int number is in between 0/ 50 return "The number is positive"
//        If the int number is  0 return "The number is zero"
//        If the number is 9 return "You have hit the lucky number!"
//        If the number is -11 return "You have hit the unlucky number!"



        String name = "-11";
        int num = Integer.parseInt(name);

        if (num == 0){
            System.out.println("The number is 0");
        }
        else if (num <= 50 && num >= 0) {
            System.out.println("The number is positive");
        }
         if (num == 9){
            System.out.println("You have hit the lucky number");
        }
        else if (num >= -50 && num < 0){
            System.out.println("The number is negative");
        }

        if(num == -11){
            System.out.println("You have hit the unlucky number");
        }


        //        Create a method which will take an int for age and char as letter
//        if the age is older than 30 and letter is uppercase print out "Age and letter checks out"
//        if the age is older than 30 and letter is lowercase print out "Age checks out but letter doesn't"
//        if the age is equal or younger than 30 and letter is uppercase print out "Age doesn't check out but letter does"
//        if the age is equal or younger than 30 and letter is lowercase print out "Nothing checks out"

        int age = 20;
        char letter ='a';
        if(age > 30 && CharacterHelper.isUppercase(letter))  {
            System.out.println("Age and letter checks out");
        }
        else if(age > 30 && CharacterHelper.isLowercase(letter)) {
            System.out.println("Age checks out but letter doesn't");
        }
        else if (age <= 30 && CharacterHelper.isUppercase(letter)) {
            System.out.println("Age doesn't check out but letter does");
        }
        else
            System.out.println("Nothing checks out");

    }
}