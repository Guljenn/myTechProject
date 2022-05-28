package collections_Practice;

import java.util.*;

public class Removing_Duplicates {



        public static ArrayList<Integer> arrayList(ArrayList<Integer> numbers){
            return new ArrayList<>(new HashSet<>(numbers));
        }

    public static boolean isPrime(int number) {
            int sqrt = (int) Math.sqrt(number) + 1;
            for (int i = 2; i < sqrt; i++) {
                if (number % i == 0) { // number is perfectly divisible - no prime
                    return false;
                }

            }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(arrayList(new ArrayList<>(Arrays.asList(1, 2, 4, 2, 2, 4))));  // [1, 2, 4]

        System.out.println(isPrime(4));
    }



    }

