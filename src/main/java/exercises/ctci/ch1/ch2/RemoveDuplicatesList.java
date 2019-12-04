package exercises.ctci.ch1.ch2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesList {
  public LinkedListNode removeDuplicates(LinkedListNode head) {
    Set<Integer> alreadySeen = new HashSet<>();
    LinkedListNode node = new LinkedListNode(head.getVal(), head.getNext());
    LinkedListNode newHead = node;
    while (node != null) {
      alreadySeen.add(node.getVal());
      if (node.getNext() != null && alreadySeen.contains(node.getNext().getVal())) {
        node.setNext(node.getNext().getNext());
      } else {
        node = node.getNext();
      }
    }
    return newHead;
  }

  public LinkedListNode removeDuplicatesNoAdditionalMemory(LinkedListNode head) {
      LinkedListNode cur = head;
      LinkedListNode runner = null;

      while(cur != null) {
          runner = cur;
          while(runner.getNext() != null) {
              if(runner.getNext().getVal() == cur.getVal()) {
                  runner.setNext(runner.getNext().getNext());
              } else {
                  runner = runner.getNext();
              }
          }
          cur = cur.getNext();

      }

      return  head;
  }
}
