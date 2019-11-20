package exercises.hackerrank;

// LC 560. Subarray Sum Equals K
public class SubarraySum {
  public int subarraySum(int[] nums, int k) {
    int count = 0;
    short start, end;
    for (start = 0; start < nums.length; start++) {
             int sum = 0;
             for(end = start; end < nums.length; end++) {
                 sum += nums[end];
                 if(sum == k) {
                     count++;
                 }
             }
    }
    return count;
  }
}
