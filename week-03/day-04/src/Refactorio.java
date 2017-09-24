// - Create a recursive function called `refactorio`
//   that returns it's input's factorial

import java.util.Scanner;
import jdk.internal.cmm.SystemResourcePressureImpl;

public class Refactorio {

  public static void main(String[] args) {
    int input = 5;
    System.out.println("The factorial of your number is: " + factorialWithRecursion(input));
  }

  public static int factorialWithRecursion(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorialWithRecursion(n - 1);
    }
  }
}

