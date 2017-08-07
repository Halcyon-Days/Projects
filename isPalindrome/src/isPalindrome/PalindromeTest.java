package isPalindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void test() {
        assertEquals("An empty string is a palindrome", true, Palindrome.isPalindrome(""));
        assertEquals("A single character is a palindrome", true, Palindrome.isPalindrome("a"));
        assertEquals("elephant is not a palindrome", false, Palindrome.isPalindrome("elephant"));
        assertEquals("racecar is a palindrome", true, Palindrome.isPalindrome("racecar"));       
        assertEquals("RAcECar is a palindrome", true, Palindrome.isPalindrome("RAcECar"));     
        assertEquals("raccar is a palindrome", true, Palindrome.isPalindrome("raccar")); 
    }

}
