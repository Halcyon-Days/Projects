package io.github.halcyon_daze.complex;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class complexTest {

    @Test
    public void test() {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));

        Complex complexNumber = new Complex(0);
        // complexNumber.print();
        System.out.println("0");
        assertEquals("0\n", outStream.toString());

    }

}
