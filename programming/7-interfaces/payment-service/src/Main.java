/*
A company wants to automate the processing of its contracts. The processing of
a contract consists of generating the installments to be paid for that contract
based on the desired number of months.
The company uses an online payment service for installments.
Online payment services typically charge monthly interest as well as a fee
by payment. For now, the service contracted by the company is Paypal, which applies
simple interest of 1% on each installment, plus a payment fee of 2%.
Write a program to read data from a contract (contract number, contract date
and total contract value). Then the program should read the number of months to
installment of the contract, and then generate records of installments to be paid (date and value)
the first installment being paid one month after the date of contracting, the second installment two
months after the contract and so on. Show installment data on screen
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Enter contract details:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (MM/DD/YYYY): ");
        LocalDate date = LocalDate.parse(sc.next(), dateFormatter);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();
        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Enter the number of installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, n);

    System.out.println("\nInstallments:");
    for (Installment installment : obj.getInstallmentList()) {
        System.out.println(installment);
    }
    
        sc.close();

    }
}