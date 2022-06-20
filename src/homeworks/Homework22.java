package homeworks;

import java.util.*;
import java.util.stream.IntStream;

public class Homework22 {

                                // TASK-1  fibonacciSeries()

        public static int[] fibonacciSeries1(int n){
            int[] array = new int[n];
            int zero = 0, one = 1, sum;
            for(int i = 0; i <= array.length-1; i++){
                if(i == 0) array[0] = 0;
                else if (i ==1) array[1] = 1;
                else
                array[i] += zero;
                sum = zero + one;
                zero = one;
                one = sum;
            }
            return array;
        }

                                // TASK-2  fibonacciSeries1()

    public static int fibonacciSeries2(int n){
        int[] array = new int[n];
        int zero = 0, one = 1, sum;
        for(int i = 0; i <= array.length-1; i++){
            if(i == 0) array[0] = 0;
            else if (i == 1) array[1] = 1;
            else
                array[i] += zero;
                sum = zero + one;
                zero = one;
                one = sum;
        }

        return array[array.length-1];
    }

                                // TASK 3 findUniques()
    public static int[] findUniques(int[]n1, int[]n2){
        Set<Integer> uniques = new HashSet<>();

       for(int element : n1){       // put first array into a set
           uniques.add(element);
        }
       for(int element : n2){       // put second array into a set
           uniques.add(element);
       }
       List<Integer> newList = new ArrayList(uniques);    // convert set into a list to use get() method


       int[] list = new int [uniques.size()];               // store everything form the list into the array
       for(int i = 0; i <= newList.size()-1; i++){
           list[i] = newList.get(i);
       }

        return list;                      // return the array
    }

                                    // TASK - 4 isPowerOf3()

    public static boolean isPowerOf3(int n){
      if(n == 1) return true;
      else return n % 3 == 0;
    }

                                    // TASK - 5 firstDuplicate()
    /*
    Requirement:
    -Create a method called firstDuplicate()
    -This method will take an int array argument and it will
    return an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
    NOTE: If there are more than one duplicate, then return
    the one for which second occurrence has the smallest
    index.
    Test Data 1: []
    Expected Result 1: -1
    Test Data 2: [1]
    Expected Result 2: -1
    Test Data 3: [1, 2, 2, 3]
    Expected Result 3: 2
    Test Data 4: [1,  2, 3, 3, 4, 1]
     */


    public static int firstDuplicate(int[] array) {
        Set<Integer> set = new HashSet();
        for(int i=0; i<array.length; i++) {
            if(set.contains(array[i])) {
                return array[i];
            } else {
                set.add(array[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args){

             System.out.println(".........TASK -1 fibonacciSeries1()...........");
             System.out.println(Arrays.toString(fibonacciSeries1(3))); // [0, 1, 1]
             System.out.println(Arrays.toString(fibonacciSeries1(5))); // [0, 1, 1, 2, 3]
             System.out.println(Arrays.toString(fibonacciSeries1(7))); // [0, 1, 1, 2, 3, 5, 8]

             System.out.println(".........TASK -2 fibonacciSeries2()...........");
             System.out.println(fibonacciSeries2(2));  // 1
             System.out.println(fibonacciSeries2(4));  // 2
             System.out.println(fibonacciSeries2(8));  // 13

             System.out.println(".........TASK -3 findUniques()...........");
             System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{}))); // []
             System.out.println(Arrays.toString(findUniques(new int[] {}, new int[]{1, 2, 3, 2})));
             System.out.println(Arrays.toString(findUniques(new int[] {1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
             System.out.println(Arrays.toString(findUniques(new int[] {0, 9}, new int[] {9, 8, 9})));

             System.out.println(".........TASK -4 isPowerOf3...........");
             System.out.println(isPowerOf3(1));
             System.out.println(isPowerOf3(2));
             System.out.println(isPowerOf3(3));
             System.out.println(isPowerOf3(81));


             System.out.println(".........TASK - 5 firstDuplicate()...........");
             System.out.println(firstDuplicate(new int[]{}));
             System.out.println(firstDuplicate(new int[]{1}));
             System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
             System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1})); // 12345


    }

}
