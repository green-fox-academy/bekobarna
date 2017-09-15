import java.util.*;

public class Anagram {
  public static void main(String[] args) {
    System.out.println("Please tell me a word");
    Scanner scan = new Scanner(System.in);
    String firstWord = scan.nextLine();
    char[] chars = firstWord.toCharArray();
    Arrays.sort(chars);
    String firstWordSorted = new String(chars);

    System.out.println("Please tell me another word");
    String secondWord = scan.nextLine();
    char[] chars2 = secondWord.toCharArray();
    Arrays.sort(chars2);
    String secondWordSorted = new String(chars);

    System.out.println("");
    System.out.println(isAnagram(firstWordSorted, secondWordSorted));
  }

  public static boolean isAnagram (String first, String second) {
    if ((first.length() == second.length()) && (first.equalsIgnoreCase(second)))
      return true;
    else {
      return false;
    }
  }
}
