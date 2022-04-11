package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

public class Project05 {
    public static void main(String[] args) {


        System.out.println("....................TASK1...........................");

        String str = ScannerHelper.getStringFromUser();
        if (str.length() == 8){
            System.out.println(str.substring(4,8) + str.substring(0,4));
        }
        else System.out.println("This String does not have 8 characters");


        System.out.println("....................TASK2...........................");


        String sentence = ScannerHelper.getStringFromUser();
     //   String firstWord = sentence.substring(0, sentence.indexOf(" "));
      //  String lastWord = sentence.substring(sentence.lastIndexOf(" ") +1 );

        if (sentence.trim().contains(" ")){
            System.out.println(sentence.substring(sentence.lastIndexOf(" ") +1 )
                    + sentence.substring(sentence.indexOf(" "), sentence.lastIndexOf(" ") + 1)
                    + sentence.substring(0, sentence.indexOf(" ")));

        }else{
            System.out.println("This sentence does not have 2 or more words to swap");
        }

        System.out.println("....................TASK3...........................");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid", "nice"));
        System.out.println((str2.replace("idiot", "nice")));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));

        System.out.println("....................TASK4...........................");


        String name = ScannerHelper.getNameFromUser();
        if(name.length() < 2){
            System.out.println("Invalid input!!!");
        }
        else if(name.length() % 2 == 0){
            System.out.println(name.charAt(name.length()/2-1) + "" + name.charAt(name.length()/2));
        }
        else if(name.length() % 2 ==1){
            System.out.println(name.charAt(name.length()/2));
        }



        System.out.println("....................TASK5...........................");


        String country = ScannerHelper.getStringFromUser();

        if(country.length() < 5) {
            System.out.println("Invalid input!!!");
        }
        else if(country.length() > 5) {
            System.out.println(country.substring(2, country.length()-2));
        }

        System.out.println("....................TASK6...........................");


        String address = ScannerHelper.getAddressFromUser();

        System.out.println(address.toLowerCase()
                .replace("a", "*")
                .replace("e", "#")
                .replace("i", "+")
                .replace("o", "$")
                .replace("u", "@"));


        System.out.println("....................TASK7...........................");



        int randomNum1 = RandomNumberGenerator.getRandomNumber(0, 25);
        int randomNum2 = RandomNumberGenerator.getRandomNumber(0, 25);
        System.out.println(randomNum1);
        System.out.println(randomNum2);


            for(int i = Math.min(randomNum1,randomNum2); i <= Math.max(randomNum1,randomNum2); i++){
                if(i % 5 != 0){
                    System.out.println(i + " " );
                }
            }



    }
}