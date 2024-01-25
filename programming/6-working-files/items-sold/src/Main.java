/*
Write a program to read the path of a .csv file
containing data about sold items. Each item has a
name, unit price and quantity, separated by a comma.
You should generate a new file called "summary.csv", located
in a subfolder called "out" of the original folder
source file, containing only the name and total value for
of this item (unit price multiplied by quantity).
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String strFile = sc.nextLine();

        String targetFile = "/out/summary.csv";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] part = line.split(",");
                Product product = new Product(part[0], Double.parseDouble(part[1]), Integer.parseInt(part[2]));
                list.add(product);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
            for (Product item : list) {
                bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                bw.newLine();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();

    }
}