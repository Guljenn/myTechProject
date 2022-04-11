package homeworks;

import utilities.CharacterHelper;
import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {


        System.out.println("<<<<<<<<<<<<<<<TASK1>>>>>>>>>>>>>>>>>>>");
        String s = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                s += i + " - ";
            }
        }
        System.out.println(s.substring(0, s.length() - 2));

        System.out.println("\n<<<<<<<<<<<<<<<TASK2>>>>>>>>>>>>>>>>>>>");

        String s1 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) {
                s1 += i + " - ";
            }
        }
        System.out.println(s1.substring(0, s1.length() - 2));

        System.out.println("\n<<<<<<<<<<<<<<<TASK3>>>>>>>>>>>>>>>>>>>");

        String s2 = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) {
                s2 += i + " - ";
            }
        }
        System.out.println(s2.substring(0, s2.length() - 2));

        System.out.println("\n<<<<<<<<<<<<<<<TASK4>>>>>>>>>>>>>>>>>>>");


        for (int i = 0; i < 8; i++) {

            System.out.println("The square root of " + i + " is = " + i * i);

        }
        System.out.println("\n<<<<<<<<<<<<<<<TASK5>>>>>>>>>>>>>>>>>>>");

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;

        }
        System.out.println(sum);

        System.out.println("\n<<<<<<<<<<<<<<<TASK6>>>>>>>>>>>>>>>>>>>");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int number = scan.nextInt();


        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }

        System.out.println(product);

        System.out.println("\n<<<<<<<<<<<<<<<TASK7>>>>>>>>>>>>>>>>>>>");


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        String name1 = input.nextLine().toLowerCase();
        scan.nextLine();

        int count = 0;
        for (int i = 0; i < name1.length(); i++) {
            char ch = name1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;


            }
        }
        System.out.println("There are " + count + " number of vowels  in the name " + name1);


        System.out.println("\n<<<<<<<<<<<<<<<TASK8>>>>>>>>>>>>>>>>>>>");


        System.out.println("\n<<<<<<<<<<<<<<<TASK9>>>>>>>>>>>>>>>>>>>");

        int a = 0, b = 1, c = 0;
        String fib = "";

                    for(int i = 0; i < 5; i++){
                        fib += a + " - ";
                        c = a + b;
                        a = b;
                        b = c;
                    }

                System.out.println(fib.substring(0, fib.length()-3));



           System.out.println("\n<<<<<<<<<<<<<<<TASK10>>>>>>>>>>>>>>>>>>>");

           Scanner userInput = new Scanner(System.in);
           String names;

         do {
             System.out.println("Please enter your name");
             names = userInput.nextLine();

         }while(names.charAt(0) != 'j');

    }
}