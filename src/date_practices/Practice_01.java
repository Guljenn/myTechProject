package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        /*
        Write a program that asks the user to enter their date of year
        then calculate their age and print with message below
        "You are {age} years old"
         */
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        dateFormat.format(date);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your date of year");
        int  YOB = scan.nextInt();

        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date)) - YOB) + " years old!");



    }
}
