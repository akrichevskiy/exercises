package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static exercises.leetcode.ListNodeUtils.*;
import static org.junit.Assert.assertEquals;


public class ReverseLinkedListTest {
    private ReverseLinkedList reverseLinkedList = new ReverseLinkedList();


    @Test
    public void testRecursiveFourElements() {
        ListNode head = create(Arrays.asList(1, 2, 3, 4));

        ListNode result = reverseLinkedList.reverseList(head);
        print(result);
        assertEquals(Arrays.asList(4, 3, 2, 1), toList(result));
    }

    @Test
    public void testRecursiveThreeElements() {
        ListNode head = create(Arrays.asList(1, 2, 3));

        ListNode result = reverseLinkedList.reverseList(head);
        print(result);
        assertEquals(Arrays.asList(3, 2, 1), toList(result));
    }

    @Test
    public void testRecursiveTwoElements() {
        ListNode head = create(Arrays.asList(1, 2));

        ListNode result = reverseLinkedList.reverseList(head);
        print(result);
        assertEquals(Arrays.asList(2, 1), toList(result));
    }

    @Test
    public void testIterativeTwoElements() {
        ListNode head = create(Arrays.asList(1, 2));
        ListNode result = reverseLinkedList.reverseListIterative(head);
        print(result);
        assertEquals(Arrays.asList(2, 1), toList(result));
    }

    @Test
    public void testIterativeFourElements() {
        ListNode head = create(Arrays.asList(1, 2, 3, 4));
        ListNode result = reverseLinkedList.reverseListIterative(head);
        print(result);
        assertEquals(Arrays.asList(4, 3, 2, 1), toList(result));
    }
}
