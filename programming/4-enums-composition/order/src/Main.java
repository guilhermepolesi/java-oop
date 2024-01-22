/*
Write a program to read data from an order with N items (N provided by the user). So show an
Order Summary. Note: Ordering time must be
the instant of the system.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (MM/DD/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), dateFormatter);
        Client client = new Client(name, email, birthDate);
        order.setClient(client);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        order.setStatus(orderStatus);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data: \n", i+1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, price);
            order.addItem(new OrderItem(quantity, price, product));
        }

        LocalDateTime currentDateTime = LocalDateTime.now();
        order.setMoment(currentDateTime);

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        sc.close();

    }
}