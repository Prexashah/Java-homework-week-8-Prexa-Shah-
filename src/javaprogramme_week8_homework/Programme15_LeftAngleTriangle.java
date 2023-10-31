package javaprogramme_week8_homework;

import java.util.Scanner;

/**
 * . Display left angle triangle of * using nested for loops
 */

public class Programme15_LeftAngleTriangle {
    public static void drawLeftAngleTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k<= i; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the height of left-angled triangle :  ");
        int height = scan.nextInt();

        drawLeftAngleTriangle(height);
        scan.close();
    }
}
