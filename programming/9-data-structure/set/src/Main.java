/*
In an online course portal, each user has a unique code, represented by an integer.
Each portal instructor can have multiple courses, and the same student can
sign up for as many courses as you want. Thus, an instructor's total number of students does not
is simply the sum of students from all courses he has, as there may be
students repeating more than one course.
Instructor Alex has three courses A, B, and C and wants to know the total number of students.
Write a program to read students in instructor Alex's courses A, B, and C, then show the
total quantity and students.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.print("\nHow many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.print("\nHow many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("\nTotal students: " + total.size());

        sc.close();

    }
}