/*
Write a program to read the width and height values of a rectangle.
Then, show on the screen the value of its area, perimeter and diagonal.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width, height;
        width = sc.nextDouble();
        height = sc.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.width = width;
        rectangle.height = height;

        System.out.printf("AREA = %.2f\n", rectangle.area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());

        sc.close();

    }
}