package javaprogramme_week8_homework;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3_FindOfConsonant {
    public static void main(String[] args) {

        //Scanner declaration for reading input form console//
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        String Input = scan.next();

        if(Input.length() == 1) {
        char c = Input.charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            c = Character.toLowerCase(c);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c + " is a Vowel");

            } else {
                System.out.println(c + " is a consonant");
            }

        } else{
                System.out.println("Error: Not a valid character");
            }
        } else {
            System.out.println ( "Error : please enter a single character");

        }
        scan.close();
    }
}
