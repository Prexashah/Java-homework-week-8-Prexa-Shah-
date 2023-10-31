package javaprogramme_week8_homework;

import java.util.Scanner;

public class Programme8_RightAngleTriangle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the right-angled triangle: ");
        int numRows = scanner.nextInt();

        // Loop to print the right-angled triangle
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println(); // Move to the next line for the next row
        }

        scanner.close();
    }
}

