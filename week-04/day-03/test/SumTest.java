import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
    ArrayList<Integer> list;
    Sum number;

    @Before
    public void setUp() throws Exception {
        number = new Sum();
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    @Test
    public void summing() throws Exception {
        int expected= 15;
        assertEquals(expected, number.summing());

    }
}
