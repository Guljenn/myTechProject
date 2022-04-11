package methods;

import utilities.FindNumbersBetween2Numbers;
import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class TestingMathHelper {
    public static void main(String[] args) {


        System.out.println(FindNumbersBetween2Numbers.findNumsBet_50And0(RandomNumberGenerator.getRandomNumber(20, 100)));
    }
}
