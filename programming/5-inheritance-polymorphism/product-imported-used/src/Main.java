/*
Write a program to read data from N products (N provided by the user).
At the end, show the price tag of each product on the
same order in which they were typed.
Each product has a name and price.
Products imported goods have a customs tax, and
Used products have a manufacturing date.
This specific data must be added to the price tag. For products
imported, taxes and customs must be added to the final price of the product.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data:\n", i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            switch (response) {
                case 'c':
                    list.add(new Product(name, price));
                    break;
                case 'u':
                    System.out.print("Manufacture date (MM/DD/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), dateFormatter);
                    list.add(new UsedProduct(name, price, date));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, customsFee));
                    break;
                default:
                    System.out.println("Error!");
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product obj : list) {
            System.out.println(obj.priceTag());
        }

        sc.close();

    }
}