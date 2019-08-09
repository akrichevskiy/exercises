package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static exercises.leetcode.ListNodeUtils.create;
import static exercises.leetcode.ListNodeUtils.toList;
import static org.junit.Assert.*;

public class MergeTwoLinkedListsTest {
    private MergeTwoLinkedLists mergeTwoLinkedLists = new MergeTwoLinkedLists();

    @Test
    public void test() {
        ListNode l1 = create(Collections.singletonList(5));
        ListNode l2 = create(Arrays.asList(1,2,4));
        ListNode result = mergeTwoLinkedLists.mergeTwoLists(l1, l2);
        assertEquals(Arrays.asList(1,2,4,5), toList(result));
    }

    @Test
    public void test2() {
        ListNode l1 = create(Arrays.asList(1,3,4));
        ListNode l2 = create(Arrays.asList(1,2,4));
        ListNode result = mergeTwoLinkedLists.mergeTwoLists(l1, l2);
        assertEquals(Arrays.asList(1,1,2,3,4,4), toList(result));
    }

}
