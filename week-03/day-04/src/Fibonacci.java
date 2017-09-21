// The fibonacci sequence is a famous bit of mathematics, and it happens to
// have a recursive definition. The first two values in the sequence are
// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
// and so on. Define a recursive fibonacci(n) method that returns the nth
// fibonacci number, with n=0 representing the start of the sequence.

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please tell me a number:");
    int number = scan.nextInt();
    System.out.println(fibo(number));
  }

  static int fibo(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return (fibo(n - 1) + fibo( n - 2));
    }
  }
}