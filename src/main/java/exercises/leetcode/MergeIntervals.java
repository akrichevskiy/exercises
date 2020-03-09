package exercises.leetcode;

import java.util.LinkedList;
import java.util.List;

//#56
public class MergeIntervals {

        public int[][] merge(int[][] intervals) {
            List<List<Integer>> intervalList = new LinkedList();
            for(int i = 0; i < intervals.length; i++) {
                List<Integer> interval = new LinkedList<>();
                for(int j = 0; j < 2; j++) {
                    interval.add(intervals[i][j]);
                }
                intervalList.add(interval);
            }
            boolean resetList = false;
            for(int i = 0; i < intervalList.size(); i++) {
                if(resetList) {
                    i--;
                    resetList = false;
                }
                for(int j = i +1; j < intervalList.size(); j++) {
                    List<Integer>  first = intervalList.get(i);
                    List<Integer> second = intervalList.get(j);
                    int a = first.get(0), b = first.get(1);
                    int c = second.get(0), d = second.get(1);
                    if ( ((a<= c&& c <= b) || (a<=d && d <= b))
                            || ((c <=a) && (a <=d) && (c <=b) && (b <=d))
                    ) {
                        int newStart = Math.min(a,c);
                        int newEnd = Math.max(b,d);
                        List<Integer> newInterval = new LinkedList();
                        newInterval.add(newStart);
                        newInterval.add(newEnd);
                        intervalList.set(i,newInterval);
                        intervalList.remove(j);
                        resetList = true;
                    }
                }
            }
            int [][] merged = new int[intervalList.size()][2];
            for(int i = 0; i < intervalList.size(); i++) {
                List<Integer> interval = intervalList.get(i);
                merged[i][0] = interval.get(0);
                merged[i][1] = interval.get(1);
            }
            return merged;
        }
}
