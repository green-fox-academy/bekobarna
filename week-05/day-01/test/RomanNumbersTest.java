import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumbersTest {
    RomanNumbers romanNumbers;

    @Before
    public void name() throws Exception {
        if (romanNumbers == null)
        romanNumbers = new RomanNumbers();
    }

    @Test
    public void convertToRoman1() throws Exception {
        assertEquals("I", romanNumbers.convertToRoman(1));
    }
    @Test
    public void convertToRoman2() throws Exception {
        assertEquals("II", romanNumbers.convertToRoman(2));
    }
    @Test
    public void convertToRoman3() throws Exception {
        assertEquals("III", romanNumbers.convertToRoman(3));
    }
    @Test
    public void convertToRoman4() throws Exception {
        assertEquals("IV", romanNumbers.convertToRoman(4));
    }
    @Test
    public void convertToRoman5() throws Exception {
        assertEquals("V", romanNumbers.convertToRoman(5));
    }
    @Test
    public void convertToRoman6() throws Exception {
        assertEquals("VI", romanNumbers.convertToRoman(6));
    }
    @Test
    public void convertToRoman7() throws Exception {
        assertEquals("VII", romanNumbers.convertToRoman(7));
    }
    @Test
    public void convertToRoman8() throws Exception {
        assertEquals("VIII", romanNumbers.convertToRoman(8));
    }
    @Test
    public void convertToRoman9() throws Exception {
        assertEquals("IX", romanNumbers.convertToRoman(9));
    }
    @Test
    public void convertToRoman10() throws Exception {
        assertEquals("X", romanNumbers.convertToRoman(10));
    }
    @Test
    public void convertToRoman39() throws Exception {
        assertEquals("XXXIX", romanNumbers.convertToRoman(39));
    }

}