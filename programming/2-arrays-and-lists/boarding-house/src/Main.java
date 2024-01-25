/*
The owner of a boarding house has ten rooms to rent to students,
These rooms are identified by numbers from 0 to 9.
Make a program that starts with all ten rooms empty and then
read a quantity N representing the number of students who will
rent rooms (N can be from 1 to 10). Then register the rental
N students. For each rental record, enter the name and email of the
student, as well as which of the rooms he chose (from 0 to 9). Suppose
that a spare room be chosen. In the end, your program should print
report of all occupations in the boarding house, in order of room.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rent[] rent = new Rent[9];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d\n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rent[room] = new Rent(name, email);
            System.out.println();
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < rent.length; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        sc.close();

    }
}