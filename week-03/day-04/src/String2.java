// Given a string, compute recursively a new string where all the 'x' chars have been removed.

import java.util.Scanner;

public class String2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Write me a word with x`s:");
    String inputString = scan.nextLine();

    System.out.println(string(inputString));
  }

  public static String string(String word) {
    if (word.contains("x") == false) {
      return word;
    }  else {
      return string(word.replace("x", ""));
    }
  }
}