/*
Write a program to read the dollar exchange rate, and then a value in dollars to be purchased by a person in R$.
Inform how many R$ the person will pay for the dollars, also considering that the person will have to pay 6% IOF on the dollar value.
Create a CurrencyConverter class to be responsible for the calculations.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar prince? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.dollarPrice = dollarPrice;
        currencyConverter.dollarBought = dollarBought;

        double amount = currencyConverter.calculateValue();
        amount += amount * CurrencyConverter.iof;

        System.out.printf("\nAmount to be paid in R$ = %.2f", amount);

        sc.close();

    }
}