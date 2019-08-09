package exercises.leetcode;

import java.util.LinkedList;
import java.util.List;

public class ListNodeUtils {
    public static ListNode create(List<Integer> input) {
        ListNode head = null;
        ListNode copy = null;
        for (Integer in : input) {
            if (head == null) {
                head = new ListNode(in);
                copy = head;
            } else {
                copy.next = new ListNode(in);
                copy = copy.next;
            }
        }
        return head;
    }

    public static List<Integer> toList(ListNode head) {
        List<Integer> result = new LinkedList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
