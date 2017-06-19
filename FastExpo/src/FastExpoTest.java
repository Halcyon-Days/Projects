import static org.junit.Assert.*;

import org.junit.Test;

import io.github.halcyon_daze.fast_expo.FastExpo;

public class FastExpoTest {

    @Test
    public void test() {
        assertEquals("0 to the 0th power should be 1", 1, FastExpo.getPow(0,0), 0.001);
        assertEquals("1 to the 0th power should be 1", 1, FastExpo.getPow(1,0), 0.001);
        assertEquals("0 to the 1st power should be 0", 0, FastExpo.getPow(0,1), 0.001);
        assertEquals("1 to the 1st power should be 1", 1, FastExpo.getPow(1,1), 0.001);
        assertEquals("-1 to the 0th power should be 1", 1, FastExpo.getPow(-1,0), 0.001);
        assertEquals("1 to the -1st power should be 1", 1, FastExpo.getPow(0,0), 0.001);
        assertEquals("2 to the 2nd power should be 4", 4, FastExpo.getPow(2,2), 0.001);
        assertEquals("2 to the -2nd power should be 0.25", 0.25, FastExpo.getPow(2,-2), 0.001);
        assertEquals("2 to the 12nd power should be 4096", 4096, FastExpo.getPow(2,12), 0.001);
    }

}
