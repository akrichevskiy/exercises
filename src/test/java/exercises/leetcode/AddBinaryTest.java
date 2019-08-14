package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {
    @Test
    public void test() {
        AddBinary addBinary = new AddBinary();
        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
        assertEquals("11110", addBinary.addBinary("1111", "1111"));
    }

}
