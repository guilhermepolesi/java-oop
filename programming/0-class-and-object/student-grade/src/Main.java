/*
Write a program to read a student's name and the three grades he got in the three quarters of the year
(first quarter is worth 30 and the second and third are worth 35 each).
At the end, show the student's final grade for the year.
Also say whether the student is approved (PASS) or not (FAILED) and, if not
how many points are left for the student to obtain the minimum to pass (which is 60% of the grade).
You must create a Student class to solve this problem.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Student's name: ");
        String name = sc.nextLine();
        double grade1, grade2, grade3;
        System.out.print("Grade 1: ");
        grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        grade2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        grade3 = sc.nextDouble();

        Student student = new Student();
        student.name = name;
        student.grade1 = grade1;
        student.grade2 = grade2;
        student.grade3 = grade3;

        student.calculateGrade();
        student.printApproval();

        sc.close();

    }
}