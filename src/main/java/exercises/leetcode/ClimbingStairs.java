package exercises.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    private Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if(cache.containsKey(n)) {
            return cache.get(n);
        }
        if(n <= 2) {
            return n;
        } else {
            int result = climbStairs(n-1) + climbStairs(n-2);

            cache.put(n, result);
            return result;
        }
    }
}
