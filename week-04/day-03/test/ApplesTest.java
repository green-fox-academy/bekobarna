import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApplesTest {
    Apples apple;

    @Before
    public void setUp() throws Exception {
        apple = new Apples("apple");
    }

    @Test
    public void getApple() throws Exception {
        assertEquals("apple", apple.getApple());
    }

}