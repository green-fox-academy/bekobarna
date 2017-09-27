import java.util.Arrays;

public class Anagram {

    public boolean isAnagram (String first, String second) {
        char[] chars = first.toCharArray();
        Arrays.sort(chars);
        char[] chars2 = second.toCharArray();
        Arrays.sort(chars2);
        String firstWordSorted = new String(chars);
        String secondWordSorted = new String(chars2);

       if ((firstWordSorted.length() == secondWordSorted.length()) && (firstWordSorted.equalsIgnoreCase(secondWordSorted)))
            return true;
        else {
            return false;
       }
    }

}
