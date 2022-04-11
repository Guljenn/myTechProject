package ifElseStatement;

public class FindTheGreatestOfTwoNumbers {
    public static void main(String[] args) {

        /*
        find random number between 0 and 10
         */

        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

      /*
        if (num1 > num2) {
            System.out.println("The greatest number of " + num1 + " and " + num2 + " is = " + num1);
        }
        else {
            System.out.println("The greatest number of " + num1 + " and " + num2 + " is = " +num2);

            // the method above is how you find the greatest number without using math.max

        }

       */

                               // SHORTCUT IF ELSE STATEMENT
        if (num1 > num2) System.out.println("The greatest number of " + num1 + " and " + num2 + " is = " + num1);
        else System.out.println("The greatest number of " + num1 + " and " + num2 + " is = " +num2);

        // THIS CAN ONLY BE USED IF THERE IS MORE THAN 1 STATEMENT IN A CODE BLOCK



    }
}


