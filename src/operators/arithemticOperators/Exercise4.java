package operators.arithemticOperators;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner transactionInput = new Scanner(System.in);

        System.out.println("Please enter your balance: ");
        double balance = transactionInput.nextDouble();

        System.out.println("Please enter your transaction: ");
        double firstTran = transactionInput.nextDouble();
        balance -= firstTran;
        System.out.println("Balance after 1st transaction = " + balance);

        System.out.println("Enter your second transaction");
        double secondTran = transactionInput.nextDouble();
        balance -= secondTran;
        System.out.println("Balance after 2nd Transaction: "+ balance);

        System.out.println("Enter your third transaction");
        double thirdTran = transactionInput.nextDouble();
        balance -= thirdTran;
        System.out.println("Balance after third transaction =" + balance);






        //  balance = 100.00
        //  1st Transaction = 25.75
        //  2nd Transaction = 12.50
        //  3rd Transaction = 7.25


    }
}
