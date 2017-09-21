// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please tell me a number:");
    int number = scan.nextInt();
    System.out.println(numberAdd(number));
  }

  public static int numberAdd(int n) {
    if (n >= 1) {
      return numberAdd(n - 1) + n ;
    } else {
      return 0;
    }
  }

}
