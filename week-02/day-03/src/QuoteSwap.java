// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Also, print the sentence to the output with spaces in between.

import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
//      ArrayList<String> correctList = new ArrayList<String>(Arrays.asList("What", "I", "cannot", "create,", "I", "do", "not", "understand."));

        list.add(2,list.get(5));
        list.remove(3);
        list.remove(5);
        list.add(5, "do");


        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
