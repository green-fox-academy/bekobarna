// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Please write 5 numbers here: ");
        Scanner scan1 = new Scanner (System.in);
        int num1 = scan1.nextInt();
        Scanner scan2 = new Scanner (System.in);
        int num2 = scan2.nextInt();
        Scanner scan3 = new Scanner (System.in);
        int num3 = scan3.nextInt();
        Scanner scan4 = new Scanner (System.in);
        int num4 = scan4.nextInt();
        Scanner scan5 = new Scanner (System.in);
        int num5 = scan5.nextInt();
        int sum = (num1 + num2 +num3 + num4 + num5);
        int average = ((num1 + num2 +num3 + num4 + num5) / 5);
        System.out.println("Sum: " + sum + ", " + "Average: " + average);

    }
}

