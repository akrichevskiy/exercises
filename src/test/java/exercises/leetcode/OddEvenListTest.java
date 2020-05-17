package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class OddEvenListTest {

    @Test
    public void test() {
        OddEvenList oddEvenList = new OddEvenList();
        ListNode head = ListNodeUtils.create(Arrays.asList(1,2,3,4,5));
        ListNode result = oddEvenList.oddEvenList(head);
        assertEquals(Arrays.asList(1,3,5,2,4), ListNodeUtils.toList(result));
    }

}
