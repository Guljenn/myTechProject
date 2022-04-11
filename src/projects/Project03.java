package projects;

public class Project03 {
    public static void main(String[] args) {

                                           // TASK 1
        String s1 = "24"; String s2 = "5";
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);


        System.out.println("The sum of " + num1 + " and " + num2 + " is = " + (num1 + num2));
        System.out.println("\nThe subtraction of " + num1 + " and " + num2 + " is = " + (num1 - num2));
        System.out.println("\nThe division of " + num1 + " and " + num2 + " is = " + (double)num1 / num2);
        System.out.println("\nThe multiplication of " + num1 + " and " + num2 + " is = " + num1 * num2);
        System.out.println("\nThe remainder of " + num1 + " and " + num2 + " is = " + num1 % num2);


                                        // TASK 2
        int randomNum1 = (int)(Math.random() * 35) +1;
        System.out.println("Random number = " + randomNum1);
       if(randomNum1 == 2 || randomNum1 == 3 || randomNum1 ==5 || randomNum1 ==7 ||
               randomNum1 == 11 || randomNum1 == 13 || randomNum1 == 17 || randomNum1 == 19
            || randomNum1 == 23 || randomNum1 == 29 || randomNum1 == 31)
           System.out.println("THE NUMBER IS A PRIME NUMBER");
       else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");




                                        // TASK 3
        int number1 = (int)(Math.random()* 50) + 1;
        int number2 = (int)(Math.random()* 50) + 1;
        int number3 = (int)(Math.random()* 50) + 1;

        System.out.println("Random number 1 is = " +  Math.min(Math.min(number1, number2),number3) +
                "\nRandom number 2 is = " + number2 + "\nRandom number 3 is = " +
                        Math.max(Math.max(number1, number2),number3));
        System.out.println("End of program!!");

                                            // TASK 4
    char myChar = 'Q';

    if(myChar >= 65 && myChar <= 90)
        System.out.println("The letter is capital");
    else if(myChar <= 65 && myChar >= 90)
        System.out.println("The letter is lowercase");
    else
        System.out.println("Invalid character detected!!!");

                                          // TASK 5



        char myCharacter = 'a';
       if( myCharacter >= 65 && myCharacter <= 90 || myCharacter >= 97 && myCharacter <= 122) {
           if (myCharacter == 'a' || myCharacter == 'e' || myCharacter == 'i' || myCharacter == 'o'
                   || myCharacter == 'u' || myCharacter == 'A' || myCharacter == 'E' || myCharacter == 'I'
                   || myCharacter == 'O' || myCharacter == 'U')
               System.out.println("My character is a vowel");
           else
               System.out.println("The letter is consonant!");
       } else {
           System.out.println ("Invalid character detected!");
       }


                                            //   TASK 6


        char myChar1 = '*';
       if (myChar1 >= 32 && myChar1 <= 47 || myChar1 <= 58 && myChar1 >= 64 || myChar1 <= 91 && myChar1 >= 96
                   || myChar1 >= 123 && myChar <= 126) {
           System.out.println("Special character is " + myChar1);

       } else System.out.println("Invalid character detected!");

                                    // TASK 7


        char myChar2 = '9';

        if (myChar2 >= 48 && myChar2 <= 57) {
            System.out.println("Character is a digit");

        } else if ((myChar2 >= 65 && myChar2 <= 90) && (myChar2 >= 97 && myChar2 <= 122)) {
            System.out.println("Character is a letter");

       }  else System.out.println("Character is a special character");





    }
}