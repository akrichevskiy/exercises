package exercises.hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubarraySumTest {
  @Test
  public void test1() {
    int[] a = {1, 1, 1};
    SubarraySum subarraySum = new SubarraySum();
    assertEquals(2, subarraySum.subarraySum(a, 2));
  }

  @Test
public void test2() {
    int[] a = {1, 2, 3};
    SubarraySum subarraySum = new SubarraySum();
    assertEquals(1, subarraySum.subarraySum(a, 2));
}

  @Test
  public void test() {
    int[] a = {100, 1, 2, 3, 4};
    SubarraySum subarraySum = new SubarraySum();
    assertEquals(1, subarraySum.subarraySum(a, 6));
  }
}
