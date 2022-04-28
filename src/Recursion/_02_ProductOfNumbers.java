package Recursion;

public class _02_ProductOfNumbers {

    public static int recrusiveProduct(int n){
        if(n == 0) return 0;
        if(n > 1) return n * recrusiveProduct(n - 1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(recrusiveProduct(5));
    }
}
