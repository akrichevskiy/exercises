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
        if (head == null ||  head.next == null) {
            return head;
        } else {
            ListNode newHead = reverseList(head.next);

            if (newHead.next == null) {
                head.next = null;
                newHead.next = head;
            } else {
                ListNode newHeadCopy = new ListNode(newHead.val);
                newHeadCopy.next = newHead.next;

                while (newHeadCopy.next != null) {
                    newHeadCopy = newHeadCopy.next;
                }
                head.next = null;
                newHeadCopy.next = head;
            }
            return newHead;
        }
    }
}
