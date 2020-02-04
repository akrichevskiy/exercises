package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
  private MaximumSubarray maximumSubarray = new MaximumSubarray();

  @Test
  public void test() {
    int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
    int res = maximumSubarray.maxSubArray(nums);
    assertEquals(6, res);
  }
}
