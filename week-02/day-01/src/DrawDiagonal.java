// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;
public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("Please write a number here: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("%");
            }
            System.out.println("");
        }
    }
}