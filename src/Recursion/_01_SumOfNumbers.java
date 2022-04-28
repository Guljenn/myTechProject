package Recursion;

public class _01_SumOfNumbers {

    public static int sumOfNumbers(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    int sum = 0;
    public static int recursiveSum(int n){
        if(n > 0) return n + recursiveSum(n - 1);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5));


    }
}
