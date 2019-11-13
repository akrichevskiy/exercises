package exercises.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrlfyTest {
    @Test
    public void test() {
        Urlfy urlfy = new Urlfy();
        assertEquals("Mr%20John%20Smith",urlfy.replaceSpaces("Mr John Smith    ", 13));
    }

}
