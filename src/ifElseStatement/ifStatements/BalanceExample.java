package ifElseStatement.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;

        // inside the curly braces is code to be executed
        // statement is inside the parenthesis // variable name
        boolean isBalanceLessThan0 = balance < 0;   // false
        boolean isBalanceEquals100 = balance == 0;  // false
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000;  // false

        // create an expression for checking if balance not equal to -1

        boolean isBalNotEqT1 = balance != -1;  //true

        if (isBalNotEqT1) { //if true it will execute otherwise don't

            System.out.println("Your balance is not equal to -1");




        }

    }
}