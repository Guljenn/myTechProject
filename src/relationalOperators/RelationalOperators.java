package relationalOperators;

public class RelationalOperators {
    public static void main(String[] args) {

        // Relational Operators will only work with boolean datatype

        int a = 4;
        int b = 10;

        boolean isAEqualtoB = a==b;
        boolean isANotEqualtoB = a!=b;

        System.out.println("a = b: " + isAEqualtoB);
        System.out.println("a = b: " + isANotEqualtoB);

        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isASmallerOrEqualThanB = a <= b;

        System.out.println("a > b: " + isAGreaterThanB);
        System.out.println("a < b: " + isASmallerThanB);
        System.out.println("a >= b: " + isAGreaterOrEqualThanB);
        System.out.println("a <= b: " + isASmallerOrEqualThanB);


    }
}
