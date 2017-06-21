package io.github.halcyon_daze.collatz_conjecture;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollatzTest {

    @Test
    public void test() {
        assertEquals("Negative Numbers should return -1", -1, Collatz.getCollatz(-1));
        assertEquals("n = 0 should return -1", -1, Collatz.getCollatz(0));
        assertEquals("n = 1 should return 0", 0, Collatz.getCollatz(1));
        assertEquals("n = 2 should return 1", 1, Collatz.getCollatz(2));
        assertEquals("n = 3 should return 7", 7, Collatz.getCollatz(3));
        assertEquals("n = 4 should return 2", 2, Collatz.getCollatz(4));
        assertEquals("n = 5 should return 5", 5, Collatz.getCollatz(5));
        assertEquals("n = 6 should return 8", 8, Collatz.getCollatz(6));
        assertEquals("n = 1000 should return 111", 111, Collatz.getCollatz(1000));
    }

}
