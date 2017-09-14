// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;
public class DrawSquare {
  public static void main(String[] args) {
    System.out.println("Please write a number here: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    for (int i = 0; i <= number; i++) {
      for (int j = 0; j <= number; j++){
        if ((i == 0) || (i == number)){
          for (int k = 0; k < number-3 ; k++) {
            System.out.print("%");
          }
        } else if ((j == 0) || (j == number)) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}