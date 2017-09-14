// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Please write a number here: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i < (number); i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}