package exercises.leetcode;
// #54
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int minSum = Integer.MIN_VALUE;
        int[][] s = new int[nums.length][nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(i == j) {
                    s[i][j] = nums[i];
                } else {
                    s[i][j] = s[i][j-1] + nums[j];
                }
                if (s[i][j] > minSum) {
                    minSum = s[i][j];
                }
            }
        }

        return minSum;
    }
}
