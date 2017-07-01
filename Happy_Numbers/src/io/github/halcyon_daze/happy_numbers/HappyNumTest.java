package io.github.halcyon_daze.happy_numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class HappyNumTest {

    @Test
    public void test() {

        assertEquals("1 is a Happy Number", true, HappyNum.getHappy(1));
        assertEquals("7 is a Happy Number", true, HappyNum.getHappy(7));
        assertEquals("44 is a Happy Number", true, HappyNum.getHappy(44));
        assertEquals("188 is a Happy Number", true, HappyNum.getHappy(188));
        assertEquals("899 is a Happy Number", true, HappyNum.getHappy(899));
        
        assertEquals("2 is not a Happy Number", false, HappyNum.getHappy(2));
        assertEquals("50 is a not Happy Number", false, HappyNum.getHappy(50));
        assertEquals("101 is a not Happy Number", false, HappyNum.getHappy(101));
        assertEquals("212 is a not Happy Number", false, HappyNum.getHappy(212));
        assertEquals("985 is a not Happy Number", false, HappyNum.getHappy(985));
        
        assertEquals("1 is a Happy Number", true, HappyNum.findHappy(1));
        assertEquals("7 is a Happy Number", true, HappyNum.findHappy(7));
        assertEquals("44 is a Happy Number", true, HappyNum.findHappy(44));
        assertEquals("188 is a Happy Number", true, HappyNum.findHappy(188));
        assertEquals("899 is a Happy Number", true, HappyNum.findHappy(899));
        
        assertEquals("2 is not a Happy Number", false, HappyNum.findHappy(2));
        assertEquals("50 is a not Happy Number", false, HappyNum.findHappy(50));
        assertEquals("101 is a not Happy Number", false, HappyNum.findHappy(101));
        assertEquals("212 is a not Happy Number", false, HappyNum.findHappy(212));
        assertEquals("985 is a not Happy Number", false, HappyNum.findHappy(985));
    }

}
