package exercises.leetcode;

import java.util.*;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new LinkedList();
            HashSet alreadySeen = new HashSet();
            Arrays.sort(nums);
            for(int i = 0; i < nums.length - 1; i ++) {
                int left = i + 1;
                int right = nums.length - 1;
                while(left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[left], nums[right]);
                        if(!alreadySeen.contains(tmp)) {
                            alreadySeen.add(tmp);
                            result.add(tmp);
                        }
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }

                }
            }
            return result;
        }
}
