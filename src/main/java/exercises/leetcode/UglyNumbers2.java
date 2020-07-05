package exercises.leetcode;

import java.util.PriorityQueue;

// #264
public class UglyNumbers2 {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        for(int i = 1; i < n; i++) {
            int tmp = queue.poll();
            while (!queue.isEmpty() && queue.peek() == tmp) {
                tmp = queue.poll();
            }
            queue.add(tmp*2);
            queue.add(tmp*3);
            queue.add(tmp*5);
        }
        return queue.poll();
    }
}
