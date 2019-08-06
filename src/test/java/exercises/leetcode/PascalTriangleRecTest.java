package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PascalTriangleRecTest {

    private PascalTriangleRec pascalTriangleRec = new PascalTriangleRec();

    @Test
    public void testCompleteTriangle(){
        List<List<Integer>> result = pascalTriangleRec.generateComplete(5);
        assertEquals(Arrays.asList(1,4,6,4,1), result.get(4));
    }

    @Test
    public void testRow(){
        List<Integer> result = pascalTriangleRec.getRow(3);
        assertEquals(Arrays.asList(1,3,3,1), result);
    }


}
