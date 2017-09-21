// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

import java.util.Scanner;

public class Bunny1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many bunnies do you want:");
    int number = scan.nextInt();

    System.out.println(bunnies(number));
  }

  public static int bunnies(int n) {
    if (n == 0) {
      return 0;
    } else {
      return  2 + bunnies(n - 1);
    }
  }
}
