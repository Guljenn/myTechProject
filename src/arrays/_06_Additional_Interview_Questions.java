package arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {
        /*
        find the greatest and print it
        int[] numbers = 5, 3, 0, -5};
         */
        int[] numbers = {5, 3, 0, -5};
        for(int num : numbers) {

        }
        /*
        create a double array and store below elements
        Print the miniman numbers
         */

        double[] doubles = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double min = numbers[0];  //double min = Double.MAX_VALUE;

        for(double number : numbers){
            if(number < min) min = number;
            min = Math.min(min, number);
        }
        System.out.println(min);






}
}
