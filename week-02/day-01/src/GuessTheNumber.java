// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        int numberStored = 99;
        while (true) {
            System.out.println("Please enter a number: ");
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();
            if (guess == numberStored) {
                System.out.println("You found the number: " + numberStored);
                break;
            }
            else if (guess > numberStored) System.out.println("The stored number is lower");
            else  System.out.println("The stored number is higher");
        }
    }
}