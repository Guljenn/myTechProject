package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {

        int ran1 = RandomNumberGenerator.getRandomNumber(17, 35);

        System.out.println("The random number generated is " + ran1);

        if (MathHelper.isEven(ran1)) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");


    }
}


