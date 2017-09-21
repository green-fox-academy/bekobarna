import java.util.Scanner;
import jdk.internal.cmm.SystemResourcePressureImpl;

public class Factorial {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please tell me a number:");
    int number = scan.nextInt();
    System.out.println("The factorial of your number is: " + factorialWithRecursion(number));
  }

  public static int factorialWithRecursion(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorialWithRecursion(n - 1);
    }
  }
}
