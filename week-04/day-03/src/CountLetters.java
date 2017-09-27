import java.util.HashMap;

public class CountLetters {
    public HashMap count (String word) {
        HashMap map = new HashMap();
        int counter = 0;
        for( int i = 0; i < word.length(); i++ ) {
            if( word.charAt(i) == '$' ) {
                counter++;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), counter);
        }
        return map;
    }
}
