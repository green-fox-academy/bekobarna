import java.util.*;

public class Anagram {
  public static void main(String[] args) {
    System.out.println("Please tell me a word");
    Scanner scan = new Scanner(System.in);
    String firstWord = scan.nextLine();
    ArrayList<String> firstList = new ArrayList<>();
    firstList.add(firstWord);

    System.out.println("Please tell me another word");
    String secondWord = scan.nextLine();
    ArrayList<String> secondList = new ArrayList<>();
    secondList.add(secondWord);

    System.out.println("");
    System.out.println(isAnagram(firstList, secondList));
  }

  public static boolean isAnagram (String[] first, String[] second) {
    if (first.containsAll(second))
      return true;
    else {
      return false;
    }
  }
}
