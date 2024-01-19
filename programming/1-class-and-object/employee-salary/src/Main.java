/*
Write a program to read an employee's data (name, gross salary and tax).
Then show the employee's data (name and net salary).
Then increase the employee's salary based on a given percentage (only the gross salary is affected by the percentage)
and show the employee's data again.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee();
        employee.name = name;
        employee.grossSalary = grossSalary;
        employee.tax = tax;

        System.out.printf("\nEmployee: %s, $ %.2f", employee.name, employee.netSalary());

        System.out.println("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("\nUpdated data: %s, $ %.2f", employee.name, employee.netSalary());

    }
}