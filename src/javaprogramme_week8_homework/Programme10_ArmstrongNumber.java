package javaprogramme_week8_homework;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */

public class Programme10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number  : ");
        int num = sc.nextInt();
        int backUp = num;
        int sum = 0;

        while(num>0){
            sum = sum + (num%10)* (num % 10) *(num % 10);
            num = num / 10;
        }
        if (sum == backUp) {
            System.out.println("Armstrong");
        }else {
            System.out.println(" Not Armstrong");
        }
        sc.close();
    }
}
