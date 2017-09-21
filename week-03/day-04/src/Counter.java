// Write a recursive function that takes one parameter: n and counts down from n.

import java.util.Scanner;

public class Counter {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please tell me a number:");
    int number = scan.nextInt();
    countDown(number);
  }

  public static int countDown(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return countDown(n - 1) - 1;
    }
  }

}
