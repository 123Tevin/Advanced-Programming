package Lecture4_interfaces_abstract_classes;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initializing the bank account with a starting balance
        BankAccount account = new BankAccount(1000);

        // Creating a deposit transaction and applying it
        executeDepositTransaction(account);

        // Creating a withdrawal transaction and applying it
        executeWithdrawalTransaction(account);
    }

    private static void executeDepositTransaction(BankAccount account) {
        DepositTransaction deposit = new DepositTransaction(500, Calendar.getInstance(), "TX001");
        System.out.println("\nStarting Deposit Process:");
        deposit.printTransactionDetails();
        deposit.apply(account);
        System.out.println("Updated balance after deposit: " + account.getBalance());

        reverseTransaction(deposit, account, "Deposit");
    }

    private static void executeWithdrawalTransaction(BankAccount account) {
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(200, Calendar.getInstance(), "TX002");
        System.out.println("\nStarting Withdrawal Process:");
        withdrawal.printTransactionDetails();
        withdrawal.apply(account);
        System.out.println("Updated balance after withdrawal: " + account.getBalance());

        reverseTransaction(withdrawal, account, "Withdrawal");
    }

    private static void reverseTransaction(Transaction transaction, BankAccount account, String transactionType) {
        System.out.println("\nAttempting to Reverse " + transactionType + ":");
        if (transaction.reverse(account)) {
            System.out.println(transactionType + " successfully reversed.");
        } else {
            System.out.println(transactionType + " reversal failed due to insufficient funds.");
        }
        System.out.println("Balance after " + transactionType.toLowerCase() + " reversal: " + account.getBalance());
    }
}
