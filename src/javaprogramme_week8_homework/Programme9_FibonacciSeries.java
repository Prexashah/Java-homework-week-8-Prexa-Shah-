package javaprogramme_week8_homework;

import java.util.Scanner;

public class Programme9_FibonacciSeries {

    //calculation of Fibonacci series//
    public static void generateFibonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= 6; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Numbers to generate Fibonacci series :");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please Enter positive number");
        } else {
            System.out.println("Fibonacci series : ");
            generateFibonacciSeries(n);
        }
        scanner.close();

    }
}
