package Casting;

public class ConvertingPrimitivesToString {
    public static void main(String [] args){

        int num = 36;

        // + concatenation
        // valueOf() method

        String numStr1 = num + "";
        String numStr2 = String.valueOf(numStr1);
        System.out.println("numStr " + numStr1);
        System.out.println("numStr2 " + numStr2);

        int x = 56;
        int y = 34;

        String str = y + x + "";      // 90  always add the concatenation in the end
        String str1 = "" + x + y;     // 5634 this is wrong

        System.out.println(str);
        System.out.println(str1);

        y = 5;
        x = 3;

        String num1 = String.valueOf(y);
        String num2 = String.valueOf(x);

        System.out.println("Num 1 is: " + "5" + "," + " and num2 is: " + num2);

    int emre = 9;
    int akin = 17;

    String son1 = akin + "";
    String son2 = emre + "";

    System.out.println("Akin is " + son2+ " and Emre is " + son1);

    int number1 = 10;

    String st1 = ("" + number1 + 23 );
    System.out.println(st1);


    }
}
