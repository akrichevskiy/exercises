package exercises.ctci.ch1.ch2;


import java.util.LinkedList;
import java.util.List;

public class LinkedListNode {
  private int val;
  private LinkedListNode next;

  public void setNext(LinkedListNode next) {
    this.next = next;
  }

  public int getVal() {
    return val;
  }

  public LinkedListNode getNext() {
    return next;
  }

  public LinkedListNode(int val, LinkedListNode next) {
    this.val = val;
    this.next = next;
  }

  public static LinkedListNode create(List<Integer> vals) {
      LinkedListNode head = null;
      LinkedListNode cur = null;
      LinkedListNode prev = null;
      for(int val : vals) {
          cur = new LinkedListNode(val, null);
          if (head == null) {
              head = cur;
              prev = cur;
          } else {
              prev.setNext(cur);
              prev = cur;
          }

      }

      return head;
  }

  public static List<Integer> toList(LinkedListNode head) {
      List<Integer> result = new LinkedList<>();
      while(head!= null) {
          result.add(head.getVal());
          head = head.next;
      }
      return result;
  }

}
