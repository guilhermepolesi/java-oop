/*
Write a program to read data from N contributors (N provided by the user), which
they can be individuals or legal company and then show the amount of tax paid by each one
as well as the total taxes collected.
Individual data are: name, annual income and health expenses. Legal company data
are name, annual income and number of employees. The rules for calculating tax are as follows:
Individuals: people with income less than 20,000.00 pay 15% tax. People with
income from 20,000.00 pays 25% tax. If the person had health expenses, 50%
These expenses are tax deductible.
Example: a person whose income was 50,000.00 and had 2,000.00 in health expenses, the tax
becomes: (50,000 * 25%) - (2,000 * 50%) = 11,500.00
Legal Company: legal company pay tax of 16%. However, if the company has more than 10
employees pay 14% tax.
Example: a company whose revenue was 400,000.00 and has 25 employees, the tax is:
400,000 * 14% = 56,000.00
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data:\n", i+1);
            System.out.print("Individual or company (i/c)? ");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            switch (response) {
                case 'i':
                    System.out.print("Health expenditures: ");
                    double value = sc.nextDouble();
                    list.add(new Individual(name, anualIncome, value));
                    break;
                case 'c':
                    System.out.print("Number of employees: ");
                    int number = sc.nextInt();
                    list.add(new Company(name, anualIncome, number));
                    break;
                default:
                    System.out.println("Error!");
            }
        }

        double sum = 0;
        System.out.println("\nTAXES PAID:");
        for (TaxPayer obj : list) {
            double tax = obj.tax();
            System.out.println(obj);
            sum += tax;
        }
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();

    }
}