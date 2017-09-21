// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

import java.util.Scanner;

public class Bunny2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many bunnies do you have:");
    int number = scan.nextInt();

    System.out.println(bunnies(number));
  }

  public static int bunnies(int n) {
    if (n == 0) {
      return 0;
    } else if (n % 2 == 1) {
      return  3 + bunnies(n - 1);
    } else {
      return  2 + bunnies(n - 1);
    }
  }
}
