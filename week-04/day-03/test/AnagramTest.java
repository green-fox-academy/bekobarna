import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {
    String word1;
    String word2;
    Anagram anagram;

    @Before
    public void setUp() throws Exception {
        word1 = new String();
        word2 = new String();
        anagram = new Anagram();
    }

    @Test
    public void isAnagram() throws Exception {
        word1 = "rail safety";
        word2 = "fairy tales";
        assertTrue(anagram.isAnagram(word1, word2));
    }

}