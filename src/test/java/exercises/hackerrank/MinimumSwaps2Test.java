package exercises.hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumSwaps2Test {
    @Test
    public void test(){
        int [] arr = {2,3,4,1,5};
        assertEquals(3, MinimumSwaps2.minimumSwaps(arr));
    }

}
