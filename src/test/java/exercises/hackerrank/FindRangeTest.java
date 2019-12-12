package exercises.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRangeTest {
    @Test
    public void test() {
        FindRange findRange = new FindRange();

        int[] nums = {1,2,2,3};
        int res[] = findRange.searchRange(nums, 2);
        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
    }

    @Test
    public void test2() {
        FindRange findRange = new FindRange();

        int[] nums = {5,7,7,8,8,10};
        int res[] = findRange.searchRange(nums, 8);
        assertEquals(3, res[0]);
        assertEquals(4, res[1]);
    }

    @Test
    public void test3() {
        FindRange findRange = new FindRange();

        int[] nums = {1,2,2,3};
        int res[] = findRange.searchRange(nums, 5);
        assertEquals(-1, res[0]);
        assertEquals(-1, res[1]);
    }

    @Test
    public void test4() {
        FindRange findRange = new FindRange();

        int[] nums = {4,7};
        int res[] = findRange.searchRange(nums, 1);
        assertEquals(-1, res[0]);
        assertEquals(-1, res[1]);
    }

    @Test
    public void test5() {
        FindRange findRange = new FindRange();

        int[] nums = {1};
        int res[] = findRange.searchRange(nums, 1);
        assertEquals(0, res[0]);
        assertEquals(0, res[1]);
    }

    @Test
    public void test6() {
        FindRange findRange = new FindRange();

        int[] nums = {1,3};
        int res[] = findRange.searchRange(nums, 1);
        assertEquals(0, res[0]);
        assertEquals(0, res[1]);
    }
}
