package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {
       // Math.max(5, 1, 5);
      int max =  MathHelper.maxOfThree(5, 1, 5);

      System.out.println("Max of three numbers = " + max);

      MathHelper.maxOfThree(1.1, 1.2, 1.3);     // doubles

        double numbers = MathHelper.maxOfThree(1.1, 1.2,1.3);

      System.out.println("The max of three floating numbers are: " + numbers);

      byte b1 = (byte)(Math.random() *10);
      byte b2 = (byte)(Math.random() *10);
      byte b3 = (byte)(Math.random() *10);

      System.out.println(MathHelper.minOfThree(b1, b2, b3));

    }
}
