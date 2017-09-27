import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    int number;
    Fibonacci fib;

    @Before
    public void setUp() throws Exception {
        fib = new Fibonacci();
        number = 4;
    }

    @Test
    public void fibo() throws Exception {
        int result = 3;
        assertEquals(result, fib.fibo(number));
    }

}