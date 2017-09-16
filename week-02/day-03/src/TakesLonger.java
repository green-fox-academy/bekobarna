// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class TakesLonger {
    public static void main(String... args){
      String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
      String quoteNeeded = "always takes longer than ";
      StringBuilder quoteEmpty = new StringBuilder(quote);
      quoteEmpty.insert(21 ,quoteNeeded);
      System.out.println(quoteEmpty);
    }
}
