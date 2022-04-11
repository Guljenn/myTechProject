package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {
        /*
        Create an array to store below numbers - numbers
        10, -3, -7, 0, 0, 7, 22
         */
        int[] numbers =  {10, -3, -7, 0, 0, 7, 22};
        for(int n : numbers ){
            System.out.println(n);
        }

        /*
        find the sum of all the elements
         */
        int sum = 0;
        for(int n : numbers){
            sum+= n;
        }
        System.out.println(sum);

        int sum1 = 0;
        for(int i = 0; i < numbers.length; i++){
            sum1 += numbers[i];
        }
        System.out.println(sum1);

        // Find the sum of the first 3 elements of the array

        int sum2 = 0;

        for(int i = 0; i < numbers.length-4; i++) {  // or i = 0; i < 3
            sum2 += numbers[i];
        }
        System.out.println(sum2);

        // Find the sum of last five elements in the array
        int sum3 = 0;
        for(int i = numbers.length-5; i < numbers.length; i++) {
            sum3 += numbers[i];
        }
        System.out.println(sum3);

        //find the product of last 4 elements
        int product = 1;
        for(int i = 3; i <= numbers.length-1; i++){
            if(numbers[i] == 0) continue;
           else  product *= numbers[i];
        }
        System.out.println(product);

        // Check your collection and print true if one of the element is 0
        // print false if none of the elements is zero
        boolean isZero = false;
        for(int element : numbers) {
           if(element == 0) {
               isZero = true;
               break;
           }
        }
        System.out.println(isZero);
    }
}
