package methods;

import utilities.Calculator;
import utilities.MathHelper;

public class TestingCalculator {
    public static void main(String[] args) {
        int i1 = 15,  i2 = 2;

    int result = MathHelper.divide(i1, i2);

    System.out.println(result);

    double d1 = 15, d2 = 2;

    double result2 = MathHelper.divide(d1, d2);
    System.out.println(result2);
    }
}
