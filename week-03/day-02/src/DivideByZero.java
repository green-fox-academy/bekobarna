// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

import java.util.*;


public class DivideByZero {
  public static void main(String[] args) {
    System.out.println("Please write a number here:");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    try {
      int numDivided = 10 / number;
      System.out.println(numDivided);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
