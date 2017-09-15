import java.util.*;

public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println("Please write a word here:");
    Scanner scan = new Scanner(System.in);
    String wordInput = scan.nextLine();
    System.out.println("");
    System.out.println(createPalindrome(wordInput));
  }

  public static String createPalindrome (String word) {
      StringBuilder word2 = new StringBuilder(word);
      word2.reverse();
      word = word + word2;
      return word;
    }
}
