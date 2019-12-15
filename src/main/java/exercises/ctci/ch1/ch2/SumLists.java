package exercises.ctci.ch1.ch2;

public class SumLists {

    public LinkedListNode sum(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode cur = new LinkedListNode(0, null);
        LinkedListNode head = cur;
        int curry = 0;
        while(l1 != null) {
            if(l2 != null) {
                int val  = l1.getVal() + l2.getVal() + curry;
                int newVal = val % 10;
                curry = val /10;
                cur.setNext(new LinkedListNode(newVal, null));
                cur = cur.getNext();
                l1  = l1.getNext();
                l2 = l2.getNext();
            } else {
                cur.setNext(new LinkedListNode(l1.getVal(), null));
                cur = cur.getNext();
                l1 = l1.getNext();
            }
        }
        while(l2 != null) {
            cur.setNext(new LinkedListNode(l2.getVal(),null));
            cur = cur.getNext();
            l2 = l2.getNext();
        }

        return head.getNext();
    }

}
