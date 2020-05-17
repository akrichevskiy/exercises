package exercises.leetcode;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {

        ListNode runner = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;
        ListNode odd = head;
        ListNode oddHead = odd;
        int i = 1;
        ListNode newNext;
        while(runner != null) {
            newNext = runner.next;
            if ((i&1) == 1) {
                odd = runner;
                odd.next = runner.next == null ? null : runner.next.next;
            } else {
                even = runner;
                even.next = runner.next == null ? null : runner.next.next;
            }
            i++;
            runner = newNext;
        }


        odd.next = evenHead;
        return oddHead;
    }
}
