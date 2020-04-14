package exercises.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSum2Test {
    @Test
    public void test() {
        CombinationSum2 combinationSum2 = new CombinationSum2();
        int[] candidates = new int[] {2,5,2,1,2};

        List<List<Integer>> result =  combinationSum2.combinationSum2(candidates, 5);
        assertEquals(2, result.size());
    }
}
