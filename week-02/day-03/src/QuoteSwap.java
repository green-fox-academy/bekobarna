// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Also, print the sentence to the output with spaces in between.

import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(
            Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
//      ArrayList<String> correctList = new ArrayList<String>(Arrays.asList("What", "I", "cannot", "create,", "I", "do", "not", "understand."));
        list.add(2, list.get(5));
        list.remove(3);
        list.remove(5);
        list.add(5, "do");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}


/* String one = list.get(0);
            String two = list.get(1);
            String three = list.get(2);
            String four = list.get(3);
            String five = list.get(4);
            String six = list.get(5);
            String seven = list.get(6);
            String eight = list.get(7);
        System.out.println(one + " " + two  + " " + three + " " + four + " " + five + " " + six + " " + seven + " " + eight);*/