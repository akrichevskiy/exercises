package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ReverseLinkedListTest {
    private ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    private ReverseLinkedList.ListNode create(List<Integer> input) {
        ReverseLinkedList.ListNode head = null;
        ReverseLinkedList.ListNode copy = null;
        for (Integer in : input) {
            if (head == null) {
                head = new ReverseLinkedList.ListNode(in);
                copy = head;
            } else {
                copy.next = new ReverseLinkedList.ListNode(in);
                copy = copy.next;
            }
        }
        return head;
    }

    private List<Integer> toList(ReverseLinkedList.ListNode head) {
        List<Integer> result = new LinkedList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

    private void print(ReverseLinkedList.ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


    @Test
    public void testRecursiveFourElements() {
        ReverseLinkedList.ListNode head = create(Arrays.asList(1, 2, 3, 4));

        ReverseLinkedList.ListNode result = reverseLinkedList.reverseList(head);
        print(result);
        assertEquals(Arrays.asList(4, 3, 2, 1), toList(result));
    }

    @Test
    public void testRecursiveThreeElements() {
        ReverseLinkedList.ListNode head = create(Arrays.asList(1, 2, 3));

        ReverseLinkedList.ListNode result = reverseLinkedList.reverseList(head);
        print(result);
        assertEquals(Arrays.asList(3, 2, 1), toList(result));
    }

    @Test
    public void testRecursiveTwoElements() {
        ReverseLinkedList.ListNode head = create(Arrays.asList(1, 2));

        ReverseLinkedList.ListNode result = reverseLinkedList.reverseList(head);
        print(result);
        assertEquals(Arrays.asList(2, 1), toList(result));
    }

    @Test
    public void testIterativeTwoElements() {
        ReverseLinkedList.ListNode head = create(Arrays.asList(1, 2));
        ReverseLinkedList.ListNode result = reverseLinkedList.reverseListIterative(head);
        print(result);
        assertEquals(Arrays.asList(2, 1), toList(result));
    }

    @Test
    public void testIterativeFourElements() {
        ReverseLinkedList.ListNode head = create(Arrays.asList(1, 2, 3, 4));
        ReverseLinkedList.ListNode result = reverseLinkedList.reverseListIterative(head);
        print(result);
        assertEquals(Arrays.asList(4, 3, 2, 1), toList(result));
    }
}
