package exercises.leetcode;

public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public ListNode reverseListIterative(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null ) {
            ListNode tmp = prev;
            prev = cur;
            cur = cur.next;
            prev.next = tmp;
        }
        return prev;
    }
}
