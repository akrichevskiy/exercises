package exercises.cs106x;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class RecursionCh8Test {

    private RecursionCh8 recursionCh8 = new RecursionCh8();

    @Test
    public void test() {
        assertTrue(recursionCh8.subsetSumExists(new HashSet<Integer>(Arrays.asList(-2, 1, 3, 8)), 7));
        assertTrue(recursionCh8.subsetSumExists(new HashSet<Integer>(Arrays.asList(1, 2, 3, 4)), 7));
    }

    @Test
    public void listAllSubsets() {
        recursionCh8.listAllSubsets("ABCD");
    }

    @Test
    public void listSubsets3() {
        recursionCh8.listSubsets3("", "ABCD");
    }

    @Test
    public void countHanoiMoves() {
        assertEquals(7, recursionCh8.countMoveHanoiTowers(3));
    }

    @Test
    public void moveTower() {
        recursionCh8.moveTower(3, 'a', 'b', 'c');
        System.out.println("---");
        recursionCh8.moveTowerIterative(3, 'a', 'b', 'c');
    }

    @Test
    public void countSubsetSumWays() {
        assertEquals(0, recursionCh8.countSubsetSumWays(new HashSet<Integer>(Arrays.asList(1, 3, 4, 5)), 11));
        assertEquals(2, recursionCh8.countSubsetSumWays(new HashSet<Integer>(Arrays.asList(1, 3, 4, 5)), 5));
    }

    @Test
    public void isMeasurable() {
        assertTrue( recursionCh8.isMeasurable(4, Arrays.asList(1,3)));
        assertTrue( recursionCh8.isMeasurable(2, Arrays.asList(1,3)));
        assertFalse( recursionCh8.isMeasurable(5, Arrays.asList(1,3)));
    }

}
