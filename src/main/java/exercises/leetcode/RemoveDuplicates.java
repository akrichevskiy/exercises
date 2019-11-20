package exercises.leetcode;

public class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }
    int i, j;
    i = 0;
    j = 1;
    while (j < nums.length) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
      j++;
    }

    return i + 1;
  }
}
