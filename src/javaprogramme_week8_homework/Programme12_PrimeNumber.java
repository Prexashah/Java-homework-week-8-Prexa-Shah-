package javaprogramme_week8_homework;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * prime number is number that divisible by 1 or itself
 */
public class Programme12_PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " Is not a Prime Number");
        }

        scanner.close();

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;

        }
        return true;
    }
}
