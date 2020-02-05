package exercises.leetcode;
// #54
// Kadane's algorithm
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxGlobal = nums[0];
        int maxCurrent = nums[0];
        for(int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(maxCurrent + nums[i] , nums[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
        }

        return maxGlobal;
    }
}
