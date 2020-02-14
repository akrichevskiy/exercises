package exercises.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {
  private MaximumSubarray maximumSubarray = new MaximumSubarray();

  @Test
  public void test() {
    int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
    int res = maximumSubarray.maxSubArray(nums);
    assertEquals(6, res);
  }

  @Test
  public void randomMap() {
    Map<Integer, Integer> map = new HashMap();
    map.put(1,1);
    map.put(2,2);
    map.put(3,3);
    Object[] keys = map.values().toArray();
    Random random = new Random();
    System.out.println(keys[random.nextInt(keys.length)]);
  }
}
