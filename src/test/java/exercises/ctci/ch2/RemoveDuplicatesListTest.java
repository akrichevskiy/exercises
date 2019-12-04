package exercises.ctci.ch2;

import exercises.ctci.ch1.ch2.LinkedListNode;
import exercises.ctci.ch1.ch2.RemoveDuplicatesList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDuplicatesListTest {
    private RemoveDuplicatesList removeDuplicatesList = new RemoveDuplicatesList();

    @Test
    public void test() {
        LinkedListNode head1 = LinkedListNode.create(Arrays.asList(1,2,1,1));
        LinkedListNode noDups = removeDuplicatesList.removeDuplicates(head1);
        assertEquals(Arrays.asList(1,2), LinkedListNode.toList(noDups));
    }

    @Test
    public void test2() {
        LinkedListNode head2 = LinkedListNode.create(Arrays.asList(1,1));
        LinkedListNode noDups = removeDuplicatesList.removeDuplicates(head2);
        assertEquals(Arrays.asList(1), LinkedListNode.toList(noDups));
    }

    @Test
    public void test3() {
        LinkedListNode head1 = LinkedListNode.create(Arrays.asList(1,1,3));
        LinkedListNode noDups = removeDuplicatesList.removeDuplicates(head1);
        assertEquals(Arrays.asList(1,3), LinkedListNode.toList(noDups));
    }

    @Test
    public void test4() {
        LinkedListNode head1 = LinkedListNode.create(Arrays.asList(1,1));
        LinkedListNode noDups = removeDuplicatesList.removeDuplicatesNoAdditionalMemory(head1);
        assertEquals(Arrays.asList(1), LinkedListNode.toList(noDups));
    }

    @Test
    public void test5() {
        LinkedListNode head1 = LinkedListNode.create(Arrays.asList(1,1,2));
        LinkedListNode noDups = removeDuplicatesList.removeDuplicatesNoAdditionalMemory(head1);
        assertEquals(Arrays.asList(1,2), LinkedListNode.toList(noDups));
    }
    @Test
    public void test6() {
        LinkedListNode head1 = LinkedListNode.create(Arrays.asList(1,2,1,1));
        LinkedListNode noDups = removeDuplicatesList.removeDuplicatesNoAdditionalMemory(head1);
        assertEquals(Arrays.asList(1,2), LinkedListNode.toList(noDups));
    }
}
