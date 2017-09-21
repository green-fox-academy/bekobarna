// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

import java.util.Scanner;

public class String1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Write me a string:");
    String inputString = scan.nextLine();
    System.out.println(string(inputString));

  }

  public static String string(String word) {
    if (word.contains("x") == false) {
      return word;
    }  else {
      return string(word.replace("x", "y"));
    }
  }
}
