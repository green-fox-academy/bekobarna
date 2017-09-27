import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountLettersTest {
    String word;
    CountLetters count1;

    @Before
    public void setUp() throws Exception {
        word = new String();
        count1 = new CountLetters();
    }

    @Test
    public void count() throws Exception {
        word = "hello";
        int num = 0;

        assertEquals(0, count1.count(word));

    }

}