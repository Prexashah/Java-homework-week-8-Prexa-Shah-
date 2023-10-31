package javaprogramme_week8_homework;

import java.util.Scanner;

public class Programme2_MinAndMaxInputChallenge {
    /**
     * -Read the numbers from the console entered by the user and print the minimum
     * and maximum number the user has entered.
     * -Before the user enters the number, print the message Enter number:
     * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
     * number.
     * Hint:
     * -Use an endless while loop.
     * -Create a class with the name MinAndMaxInputChallenge
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstNumber = true;

        while (true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (firstNumber) {
                    min = number;
                    max = number;
                    firstNumber = false;
                } else {
                    min = Math.min(min, number);
                    max = Math.max(max, number);
                }
            } else {
                break;
            }

            // Consume the newline character after the number
            scanner.nextLine();
        }

        if (!firstNumber) {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("No valid numbers entered.");
        }

        scanner.close();
    }
}



