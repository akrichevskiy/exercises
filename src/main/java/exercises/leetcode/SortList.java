package exercises.leetcode;

// #148
public class SortList {

  public ListNode sortList(ListNode head) {
    int size = 0;
    ListNode cur = head;
    while (cur != null) {
      size++;
      cur = cur.next;
    }

    return sort(head, size);
  }

  private ListNode sort(ListNode head, int size) {
    if (size <= 0) {
      return null;
    } else if (size == 1) {
      return head;
    }
    int mid = size / 2;
    int i = 0;
    ListNode cur = head;
    while (i < mid - 1) {
      cur = cur.next;
      i++;
    }
    ListNode first = head;
    ListNode second = cur.next;
    cur.next = null;

    ListNode sortedFirst = sort(first, mid);
    ListNode sortedSecond = sort(second, size - mid);

    return merge(sortedFirst, sortedSecond);
  }

  private ListNode merge(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode tail = result;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        tail.next = l1;
        tail = tail.next;
        l1 = l1.next;
      } else {
        tail.next = l2;
        tail = tail.next;
        l2 = l2.next;
      }
    }

    if (l1 != null) {
      tail.next = l1;
    }

    if (l2 != null) {
      tail.next = l2;
    }
    return result.next;
  }
}
