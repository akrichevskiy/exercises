package exercises.ctci.ch1.c5;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetNextTest {
  private GetNext next = new GetNext();

  @Test
  public void test1() {
    int[] ans = next.getNext(8);
    assertArrayEquals(new int[] {4, 16}, ans);
  }

  @Test
  public void test2() {
    int[] ans = next.getNext(9);
    assertArrayEquals(new int[] {6, 10}, ans);
  }

    @Test
    public void test3() {
        int[] ans = next.getNext(1);
        assertArrayEquals(new int[] {-1, 2}, ans);
    }

    @Test
    public void test4() {
        int[] ans = next.getNext(7);
        assertArrayEquals(new int[] {-1, 11}, ans);
    }
}
