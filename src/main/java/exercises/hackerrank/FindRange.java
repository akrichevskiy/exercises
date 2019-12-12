package exercises.hackerrank;

/*
#34
 */
public class FindRange {
  public int[] searchRange(int[] nums, int target) {
    int[] result = {-1, -1};
    int low, high;
    low = 0;
    high = nums.length - 1;

    if(nums.length == 0) {
        return result;
    }
    while (low < high) {
      int mid = (high + low) / 2;
      if (nums[mid] >= target) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    result[0] = low;

    low = 0;
    high = nums.length - 1;
    while (low < high) {
      int mid = 1 + (high + low) / 2;
      if (nums[mid] > target) {
        high = mid - 1;
      } else {
        low = mid;

      }
    }
    result[1] = high;

    if (result[0] != -1 && nums[result[0]] != target) {
      result[0] = -1;
    }

    if (result[1] != -1 && nums[result[1]] != target) {
      result[1] = -1;
    }
    return result;
  }
}
