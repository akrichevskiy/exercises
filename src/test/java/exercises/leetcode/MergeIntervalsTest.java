package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeIntervalsTest {
    @Test
    public void test() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = new int[][] {{1,4},{4,5}};
        int[][] merged = mergeIntervals.merge(intervals);
        assertArrayEquals(merged[0], new int[] {1,5});
    }

    @Test
    public void tes2t() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = mergeIntervals.merge(intervals);
        assertArrayEquals(merged[0], new int[] {1,6});
        assertArrayEquals(merged[1], new int[] {8,10});
        assertArrayEquals(merged[2], new int[] {15,18});
    }
}
