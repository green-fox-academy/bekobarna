// Given a non-negative int n, return the sum of its digits recursively (no loops). 
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

import java.util.Scanner;

public class SumDigit {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please tell me a number:");
    int number = scan.nextInt();
    System.out.println(sum(number));
  }

  public static int sum(int n) {
    if ((n % 10) == n) {
      return n;
    } else {
      int rightMost = n % 10;
      return  rightMost + sum(n / 10);
    }
  }

}
