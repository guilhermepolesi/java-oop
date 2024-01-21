/*
Write a program to read an integer N and then the data (id, name and salary) from
N employees. There must be no repetition of id.
Then increase a specific employee's salary by X percent.
To do this, the program must read an id and the value
message and abort the operation. At the end, show the updated list of employees,
according to examples.
Remember to apply the encapsulation technique to prevent the salary
be changed freely. Salary can only be increased based on
increase by a certain percentage.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d:\n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();

    }
}