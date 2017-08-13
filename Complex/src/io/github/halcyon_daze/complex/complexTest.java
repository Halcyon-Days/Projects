package io.github.halcyon_daze.complex;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class complexTest {

    @Test
    public void testExpression() {
        Complex[] testNumbers = new Complex[11];
        
        testNumbers[0] = new Complex(0);
        assertEquals("Print real number 0", "0", testNumbers[0].toString());

        testNumbers[1] = new Complex(100);
        assertEquals("Print real number 100", "100", testNumbers[1].toString());
        
        testNumbers[2] = new Complex(0, 1);
        assertEquals("Print complex number i", "i", testNumbers[2].toString());
        
        testNumbers[3] = new Complex(0, -1);
        assertEquals("Print complex number -i", "-i", testNumbers[3].toString());
        
        testNumbers[4] = new Complex(0, 5);
        assertEquals("Print complex number 5i", "5i", testNumbers[4].toString());
        
        testNumbers[5] = new Complex(1, 5);
        assertEquals("Print complex number 1 + 5i", "1 + 5i", testNumbers[5].toString());
        
        testNumbers[6] = new Complex(1, -5);
        assertEquals("Print complex number 1 - 5i", "1 - 5i", testNumbers[6].toString());
        
        testNumbers[7] = new Complex(-1, -5);
        assertEquals("Print complex number -1 - 5i", "-1 - 5i", testNumbers[7].toString());
        
        testNumbers[8] = new Complex(-1, 5);
        assertEquals("Print complex number -1 + 5i", "-1 + 5i", testNumbers[8].toString());
        
        testNumbers[9] = new Complex(1, -1);
        assertEquals("Print complex number 1 - i", "1 - i", testNumbers[9].toString());
        
        testNumbers[10] = new Complex(-1, -1);
        assertEquals("Print complex number 1 + i", "-1 - i", testNumbers[10].toString());
    }
    
    @Test
    public void testChangingValue() {
        Complex testNumber1 = new Complex(0);
        assertEquals("Print real number 0", "0", testNumber1.toString());
        
        testNumber1.changeValue(1, 1);
        assertEquals("Print complex number 1 + i", "1 + i", testNumber1.toString());
    }

    @Test
    public void testAddition() {
        Complex[] testNumbers = new Complex[9];
        
        testNumbers[0] = new Complex(0);
        assertEquals(" 0 + 0 = 0", "0", testNumbers[0].add(testNumbers[0]).toString());
        
        testNumbers[1] = new Complex(1);
        assertEquals(" 1 + 1 = 2", "2", testNumbers[1].add(testNumbers[1]).toString());
        
        testNumbers[2] = new Complex(0, 1);
        assertEquals(" i + i = 2i", "2i", testNumbers[2].add(testNumbers[2]).toString());
        
        testNumbers[3] = new Complex(0, -1);
        assertEquals(" -i + -i = -2i", "-2i", testNumbers[3].add(testNumbers[3]).toString());
        
        testNumbers[4] = new Complex(1, 1);
        assertEquals(" (1 + i) + (1 + i) = 2 + 2i", "2 + 2i", testNumbers[4].add(testNumbers[4]).toString());
        
        testNumbers[5] = new Complex(1, -1);
        assertEquals(" (1 - i) + (1 - i) = 2 - 2i", "2 - 2i", testNumbers[5].add(testNumbers[5]).toString());
        
        testNumbers[6] = new Complex(-1);
        assertEquals(" -1 + -1 = -2", "-2", testNumbers[6].add(testNumbers[6]).toString());
        
        testNumbers[7] = new Complex(-1, -1);
        assertEquals(" (-1 - i) + (-1 - i) = -2 - 2i", "-2 - 2i", testNumbers[7].add(testNumbers[7]).toString());
        
        testNumbers[8] = new Complex(-1, 1);
        assertEquals(" (1 + i) + (1 + i) = -2 + 2i", "-2 + 2i", testNumbers[8].add(testNumbers[8]).toString());
        
    }
    
    @Test
    public void testSubtraction() {
        Complex[] testNumbers = new Complex[8];
        
        testNumbers[0] = new Complex(0);
        assertEquals(" 0 - 0 = 0", "0", testNumbers[0].sub(testNumbers[0]).toString());
        
        testNumbers[1] = new Complex(1);
        assertEquals(" 1 - 1 = 2", "0", testNumbers[1].sub(testNumbers[1]).toString());
        
        testNumbers[2] = new Complex(0, 1);
        assertEquals(" i - i = -2i", "0", testNumbers[2].sub(testNumbers[2]).toString());
        
        testNumbers[3] = new Complex(0, -1);
        assertEquals(" -i - -i = 0", "0", testNumbers[3].sub(testNumbers[3]).toString());
        
        testNumbers[4] = new Complex(1, 1);
        assertEquals(" (1 + i) - (1 + i) = 0", "0", testNumbers[4].sub(testNumbers[4]).toString());
        
        testNumbers[5] = new Complex(1, -1);
        assertEquals(" (1 - i) - (1 + i) = 0", "-2i", testNumbers[5].sub(testNumbers[4]).toString());
        
        assertEquals("(1 + i) - (1 - i)  = 2i", "2i", testNumbers[4].sub(testNumbers[5]).toString());
        
        testNumbers[7] = new Complex(-1, -1);
        assertEquals(" (-1 - i) - (1 + i) = -2 - 2i", "-2 - 2i", testNumbers[7].sub(testNumbers[4]).toString());

        
    }
}
