package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static exercises.leetcode.ListNodeUtils.create;
import static exercises.leetcode.ListNodeUtils.toList;
import static org.junit.Assert.*;

public class SortListTest {
    @Test
    public void test() {
        SortList sortList = new SortList();
        ListNode head =  create(Arrays.asList(4,2,1,3));
        List<Integer> sorted = toList(sortList.sortList(head));

        assertEquals(Arrays.asList(1,2,3,4), sorted);
    }

    @Test
    public void testOdd() {
        SortList sortList = new SortList();
        ListNode head =  create(Arrays.asList(4,2,1));
        List<Integer> sorted = toList(sortList.sortList(head));

        assertEquals(Arrays.asList(1,2,4), sorted);
    }

}
