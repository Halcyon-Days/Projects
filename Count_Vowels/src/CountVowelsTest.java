import static org.junit.Assert.*;

import org.junit.Test;

public class CountVowelsTest {

    @Test
    public void test() {
        assertEquals("1 Vowel in 'a'", 1, CountVowels.countVowels("a"));
        assertEquals("2 Vowels in 'apple'", 2, CountVowels.countVowels("apple"));
        assertEquals("7 Vowels in 'elephants eat apples'", 7, CountVowels.countVowels("elephants eat apples"));
        assertEquals("0 Vowels in 'bcdfghjklmnpqrtvwxyz'", 0, CountVowels.countVowels("bcdfghjklmnpqrtvwxyz"));
    }

}
