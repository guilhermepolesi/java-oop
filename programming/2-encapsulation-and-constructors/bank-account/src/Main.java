/*
In a bank, to register a bank account, you need to provide the account number, the name of the
account holder and the initial deposit amount that the holder deposited when opening the account.
This deposit amount, the initial deposit, however, is optional, that is:
if the holder does not have money to deposit at the time of opening their
account, the initial deposit will not be made and the initial account balance will naturally be zero.

Important: Once a bank account has been opened, the account number can never be changed. Already
the name of the holder can be changed (as a person can change their name upon marriage, for
example).

Finally, the account balance cannot be changed freely. There needs to be a mechanism to protect
that. The balance only increases through deposits, and only decreases through withdrawals. For each withdrawal
carried out, the bank charges a fee of $5.00. Note: the account may have a negative balance if the balance is not
enough to make the withdrawal and/or pay the fee.

You must create a program that registers an account, giving you the option to be registered or not.
inform the amount of the initial deposit. Then, make a deposit and then a withdrawal, always
showing account data after each operation.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();

    }
}