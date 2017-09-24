// Given a string, compute recursively a new string where all the 'x' chars have been removed.

import java.util.Scanner;

public class String2 {
  public static void main(String[] args) {
    String inputString = "Hello mr XxxxXXXXYZ, xxxxxxXXXXxxxxx.";
    System.out.println(string(inputString));
  }

  public static String string(String word) {
    if (word.contains("x") == false) {
      return word;
    }  else {
      return string(word.replaceFirst("x", ""));
    }
  }
}