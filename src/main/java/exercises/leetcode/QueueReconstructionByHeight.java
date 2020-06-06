package exercises.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

//406, greedy
public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.addAll(Arrays.asList(people));

        int len = people.length;
        int[][] result = new int[len][2];
        boolean[] isOccupied = new boolean[len];

        while(!pq.isEmpty()) {
            int[] person = pq.poll();
            int k = person[1];
            int h = person[0];

            if(k == 0) {
                for(int i = 0; i < len; i++) {
                    if(!isOccupied[i]) {
                        result[i] = person;
                        isOccupied[i] = true;
                        break;
                    }
                }
            } else {
                // k > 0
                int biggerOrEqualHeight = 0;
                int i = 0;
                while(biggerOrEqualHeight < k && i < len) {
                    if(!isOccupied[i]){
                        biggerOrEqualHeight++;
                    } else if(result[i][0] >= h){
                        biggerOrEqualHeight++;
                    }
                    if(biggerOrEqualHeight == k) {
                        //insert into first free position after i
                        int j = i+1;
                        while( j < len) {
                            if(!isOccupied[j]) {
                                result[j] = person;
                                isOccupied[j] = true;
                                break;
                            }
                            j++;
                        }
                        break;
                    }
                    i++;
                }
            }
        }
        return result;
    }
     /*
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        List<int[]> res = new ArrayList<>();
        for(int[] p : people){
            res.add(p[1], p);
        }
        int n = people.length;
        return res.toArray(new int[n][2]);
    }
    */
}
