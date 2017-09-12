// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
// 
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Please write the first number here: ");
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();

        System.out.println("Please write the second number here: ");
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan2.nextInt();

        if (number2 <= number1) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = number1; i <= (number2 - 1); i++) {
                System.out.println(i);
            }
        }
    }
}


