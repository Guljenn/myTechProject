package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] arg) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("TASK 1\n");

        System.out.println("What is your first name?");
        String firstName = userInput.next();

        System.out.println("What is your last name?");
        String lastName = userInput.next();

        System.out.println("How old are you?");
        int age = userInput.nextInt();

        System.out.println("What is your email address?");
        userInput.nextLine();
        String emailAddress = userInput.next();

        System.out.println("What is your phone number?");
        userInput.nextLine();
        String phoneNumber = userInput.nextLine();

        System.out.println("What is your address?");
        //    userInput.nextLine();
        String address = userInput.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". " + "John’s age is\n "
                + age + ". " + "John’s email address is " + emailAddress + ", " + "phone number" + "\n" +
                phoneNumber + ", " + "and address is " + address + ".");

        System.out.println("TASK 2\n");

        System.out.println("What is your favorite book?");
        String favBook = userInput.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = userInput.nextLine();

        System.out.println("What is your favorite number?");
        int favNumber = userInput.nextInt();

        System.out.println("User's favorite book is: " + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);


    }

}
