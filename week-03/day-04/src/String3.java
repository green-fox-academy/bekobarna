// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
  public static void main(String[] args) {
    String input = "Hello world";
    System.out.println(stringWithAsterisk(input));
  }

  public static String stringWithAsterisk(String word) {
    if (word.length() == 1) {
      return word;
    }  else {
      return word.charAt(0) + "*" + stringWithAsterisk(word.substring(1, word.length()));
    }
  }
}