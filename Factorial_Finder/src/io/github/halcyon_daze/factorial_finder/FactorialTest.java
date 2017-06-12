package io.github.halcyon_daze.factorial_finder;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void testgetFactorial() {
        assertEquals("Factorial of 0 should be 1", 1, Factorial.getFactorial(0));
        assertEquals("Factorial of 1 should be 1", 1, Factorial.getFactorial(1));
        assertEquals("Factorial of 5 should be 120", 120, Factorial.getFactorial(5));
        assertEquals("Factorial of 10 should be 3628800", 3628800, Factorial.getFactorial(10));
        assertEquals("Factorial of -1 should be 0", 0, Factorial.getFactorial(-1));
    }

    @Test
    public void testfindFactorial() {
        assertEquals("Factorial of 0 should be 1", 1, Factorial.findFactorial(0));
        assertEquals("Factorial of 1 should be 1", 1, Factorial.findFactorial(1));
        assertEquals("Factorial of 5 should be 120", 120, Factorial.findFactorial(5));
        assertEquals("Factorial of 10 should be 3628800", 3628800, Factorial.findFactorial(10));
        assertEquals("Factorial of -1 should be 0", 0, Factorial.findFactorial(-1));
    }
}
