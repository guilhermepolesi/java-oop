/*
Write a program to read data from a bank account and then perform a
withdraw from this bank account, showing the new balance. A withdrawal cannot occur
or if there is no balance in the account, or if the withdrawal amount exceeds the limit of
account withdrawal.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        Account account = null;
        try {
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();;
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();
            account = new Account(number, holder, balance, limit);
        }
        catch (InputMismatchException e) {
            System.out.println("Error!");
        }

        try {
            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}