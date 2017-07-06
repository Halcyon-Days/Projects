import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void test() {
        assertEquals("Reverse of Empty String is an Empty String", "", StringReverse.getReverse(""));
        assertEquals("Reverse of 'a' is 'a' ", "a", StringReverse.getReverse("a"));
        assertEquals("Reverse of 'apple' is 'elppa' ", "elppa", StringReverse.getReverse("apple"));
        assertEquals("Reverse of 'elephant' is 'tnahpele' ", "tnahpele", StringReverse.getReverse("elephant"));
    }

}
