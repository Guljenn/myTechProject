package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {


                      System.out.println("....................TASK1....................");
        String name = ScannerHelper.getNameFromUser();
        System.out.println("The length of " + name + " is  " + name.length());
        System.out.println("The first character of " + name + " is " + name.charAt(0));
        System.out.println("The last character of " + name + " is " + name.charAt(name.length()-1));
        System.out.println("The first three characters of " + name + " is " + name.charAt(0) + "" + name.charAt(1) + "" + name.charAt(2));
        System.out.println("The last three characters of " + name + " is "
                + name.charAt(name.length()-3) + "" + name.charAt(name.length()-2) + "" + name.charAt(name.length()-1));
        if(name.startsWith("A") || name.startsWith("a")) {
            System.out.println("You are in the club!");
        }else System.out.println("Sorry, you are not in the club");

                    System.out.println("....................TASK2....................");

        String address = ScannerHelper.getAddressFromUser();
        if(address.toLowerCase().contains("chicago") || address.toLowerCase().contains("des plaines")) {
            System.out.println("You are in the club");
        }
        else{
            System.out.println("Sorry, you will never be in the club");
        }

                    System.out.println("....................TASK3....................");
        String colors = ScannerHelper.getColorsFromUsers();

        if (colors.toLowerCase().contains("red") && colors.toLowerCase().contains("green")) {
            System.out.println("Green and red is in the list");
        }
        else if(colors.toLowerCase().contains("green")) {
            System.out.println("Green is in the list");
        }
        else if(colors.toLowerCase().contains("red")) {
            System.out.println("Red is in the list");
        }
        else
            System.out.println("Green and red are not in the list");


                   System.out.println("....................TASK4....................");


            String sentence = " Java is FUN ";
            String str = sentence.trim().toLowerCase();
            String str1 = str.substring(0, str.indexOf(" "));
            String str2 = str.substring(str.indexOf(" "), str.lastIndexOf(" "));
            String str3 = str.substring(str.lastIndexOf(" ")+1);

        System.out.println("The first word in \"" + sentence + "\" is = " + str1);
        System.out.println("The second word in \"" + sentence + "\" is = " + str2);
        System.out.println("The third word in \"" + sentence + "\" is = " + str3);

        System.out.println(name.substring(0, 3));
        System.out.println(name.length()-3);


        String str5 = "I love Java";

        String strW1 = str5.substring(0, str5.indexOf(" "));
        String strW2 = str5.substring(str.indexOf(" ")+1, str5.lastIndexOf(" "));
        String strW3 = str5.substring((str5.lastIndexOf(" ")+1));
        System.out.println(strW3 +  " " + strW2 + " " + " " + strW1);
    }
}
