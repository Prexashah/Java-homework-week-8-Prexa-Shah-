package javaprogramme_week8_homework;
/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name
 */

import java.util.Scanner;

public class Programme1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console//
        Scanner scan = new Scanner(System.in);
        //initialize variables for sum and count//
        int counter = 0;
        int sum = 0;
        //use while loop to read 10 numbers//

        while (counter < 10) {

            System.out.println("Enter number " + (counter + 1) + " : ");

            //check if user has entered an int value//
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println(" Invalid number: please enter valid number");
            }
            scan.nextLine();
        }
        //close the scanner//
        scan.close();

        //print sum of the numbers//
        System.out.println("The sum of the 10 numbers is :" + sum);


    }
}
