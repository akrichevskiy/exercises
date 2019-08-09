package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPowTest {
    private MyPow myPow = new MyPow();

    @Test
    public void testPositivePower() {
        assertEquals(0.0, myPow.myPow(0.00001,  2147483647), 0.000000000001);
        assertEquals(27, myPow.myPow(3,  3), 0.00001);

        assertEquals(8, myPow.myPow(2, 3), 0.001);
        assertEquals(1024, myPow.myPow(2, 10), 0.001);
        assertEquals(16, myPow.myPow(2, 4), 0.001);


    }

    @Test
    public void testNegativePower() {
        assertEquals(0.5, myPow.myPow(2, -1), 0.001);
        assertEquals(0.25, myPow.myPow(2, -2), 0.001);
        assertEquals(0.125, myPow.myPow(2, -3), 0.001);
    }
}
