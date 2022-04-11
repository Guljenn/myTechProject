package Casting;

public class ExerciseConvertingDataTypes {
    public static void main(String [] args){

        /*
        Write a program which will take two numbers as a STRING and get the avg of them and print it out.

        input:
        String num1 = "23"
        String num2 = "25

        Output
        24
         */

        String num1 = "23";
        String num2 = "25";

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);

        Integer num1Integer = Integer.valueOf(num1);
        Integer num2Integer = Integer.valueOf(num2);
        System.out.println("The Average of 2 numbers are = " + (num1Int + num2Int) / 2);
        System.out.println("The Average of 2 numbers are = " +(num1Integer + num2Integer) / 2);


        /*
        Assume David is going to save 390 to buy a bike. David can save only 15.60 per day. How many days later
        David can save 390 and buy the bike?

        Input save 390;
        input day = 15.60
         */

        String number1 = "390";
        String number2 = "15.60";

        double save = Double.valueOf(number1);
        double day = Double.valueOf(number2);

        System.out.println("Dave will buy the bike in: " +(int)(save / day));


    }
}
