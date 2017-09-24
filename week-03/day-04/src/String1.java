// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
  public static void main(String[] args) {
    String inputString = "xxxxxxXXXXXxxxx";
    System.out.println(string(inputString));
  }

  public static String string(String word) {
    if (word.contains("x") == false) {
      return word;
    }  else {
      return string(word.replaceFirst("x", "y"));
    }
  }
}
