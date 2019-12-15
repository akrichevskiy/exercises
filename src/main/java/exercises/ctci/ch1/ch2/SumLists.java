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

    public LinkedListNode sumRecursive(LinkedListNode l1, LinkedListNode l2) {
        return sumRecursive(l1,l2,0);
    }

    private LinkedListNode sumRecursive(LinkedListNode l1, LinkedListNode l2, int curry) {
        if(l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            int val  = l2.getVal() + curry;
            int newVal = val % 10;
            curry = val / 10;
            return new LinkedListNode(newVal, sumRecursive(null, l2.getNext(), curry));
        } else if (l2== null) {
            int val  = l1.getVal() + curry;
            int newVal = val % 10;
            curry = val / 10;
            return new LinkedListNode(newVal, sumRecursive(l1.getNext(), null, curry));
        } else {
            int val  = l1.getVal() + l2.getVal() + curry;
            int newVal = val % 10;
            curry = val / 10;
            return new LinkedListNode(newVal, sumRecursive(l1.getNext(), l2.getNext(), curry));
        }
    }

}
