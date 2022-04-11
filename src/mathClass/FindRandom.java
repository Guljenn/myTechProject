package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double random =Math.random();
        System.out.println(random);

        double randomNumber = Math.random();

        System.out.println(randomNumber);

        // Create a random number between 0 - 20 included take that test as an int

        int random0And20Included = (int) (Math.random() * 21);

        System.out.println(random0And20Included);

        /*
        Get a number between 15 - 30 (both included)
        Formula for random
        Math.random() * (endPoint - startPoint +1) + startPoint

        (int) Math.random() * 16 + 15
         */
            /*
            Create a program that generates numbers between  45 - 98 and print them out
             */
     //   int random45And98Included = (int) Math.random() * 53 + (45 + 45);

      //   System.out.println("The numbers are: " + random45And98Included);

        // System.out.println((int)(Math.random() * 54 + 45));

        /*
         Create a program that generates numbers between  67 - 85 and print it out the number 1 and number 2 and max and min
         */







    }
}
