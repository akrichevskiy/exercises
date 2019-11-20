package exercises.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicatesTest {
  @Test
  public void test() {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    int a[] = {0, 0, 1, 1, 2, 2, 2, 3};
    assertEquals(4, removeDuplicates.removeDuplicates(a));
  }

@Test
public void test2() {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    int a[] = {0,1};
    assertEquals(2, removeDuplicates.removeDuplicates(a));
}
}
