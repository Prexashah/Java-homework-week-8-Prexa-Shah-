package javaprogramme_week8_homework;

import java.util.Scanner;

/**
 * Write a programme in Java to display the pattern like a diamond.
 * use while loop.
 */
public class Programme14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            drawDiamond(rows);
        }

        scanner.close();
    }

    public static void drawDiamond(int rows) {
        int spaces = rows / 2;
        int stars = 1;
        int row = 1;

        while (row <= rows) {
            int spaceCount = spaces;
            int starCount = stars;

            // Print spaces
            while (spaceCount > 0) {
                System.out.print(" ");
                spaceCount--;
            }

            // Print stars
            while (starCount > 0) {
                System.out.print("*");
                starCount--;
            }

            System.out.println();

            if (row <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }

            row++;
        }
    }
}


