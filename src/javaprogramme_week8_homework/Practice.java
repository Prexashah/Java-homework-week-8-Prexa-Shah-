package javaprogramme_week8_homework;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        drawLeftAngleTriangle(rows);

        scanner.close();
    }

    public static void drawLeftAngleTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print two spaces for visual effect
                }
            }
            System.out.println();
        }
    }
}

