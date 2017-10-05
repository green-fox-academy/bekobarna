// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please tell me two numbers:");
      int number1 = scan.nextInt();
      int number2 = scan.nextInt();
      System.out.println(powerN(number1, number2));
  }

  public static int powerN(int n, int base) {
      if ((n == 0) || (base == 0)) {
        return 1;
      } else {
        return  n * powerN(n, base - 1);
      }
  }
}
