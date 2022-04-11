package methods;

import utilities.MathHelper;

public class TestingAbs {

    public static void main(String[] args) {

        /*
        Find the absolute value of 2 numbers
         */

        int a = MathHelper.absoluteValue(4, 6);
        int b = Math.abs((2-6));

        System.out.println( a);
        System.out.println( b);


    }
}
