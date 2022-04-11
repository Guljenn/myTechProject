package scanner;


import java.util.Scanner;

public class Exercise {
    public static void main(String [] args){
        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your first name.");
        String firstName = info.next();

        System.out.println("Please enter your last name.");
        String lastName = info.next();

        System.out.println("Your full name is:" +firstName + " " + lastName);






    }
}
