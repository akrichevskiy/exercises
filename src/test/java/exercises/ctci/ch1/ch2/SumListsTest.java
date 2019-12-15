package exercises.ctci.ch1.ch2;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class SumListsTest {
    private SumLists sumLists = new SumLists();

    @Test
    public void test(){
        LinkedListNode l1 = LinkedListNode.create(Arrays.asList(7,1,6));
        LinkedListNode l2 = LinkedListNode.create(Arrays.asList(5,9,2));

       List<Integer> result = LinkedListNode.toList(sumLists.sum(l1,l2));

       assertEquals(Arrays.asList(2,1,9), result);
    }

    @Test
    public void test2(){
        LinkedListNode l1 = LinkedListNode.create(Arrays.asList(7,1,6));
        LinkedListNode l2 = LinkedListNode.create(Arrays.asList(9,2));

        List<Integer> result = LinkedListNode.toList(sumLists.sum(l1,l2));

        assertEquals(Arrays.asList(6,4,6), result);
    }

    @Test
    public void test3(){
        LinkedListNode l1 = LinkedListNode.create(Arrays.asList(7,1,6));
        LinkedListNode l2 = null;

        List<Integer> result = LinkedListNode.toList(sumLists.sum(l1,l2));

        assertEquals(Arrays.asList(7,1,6), result);
    }
}
