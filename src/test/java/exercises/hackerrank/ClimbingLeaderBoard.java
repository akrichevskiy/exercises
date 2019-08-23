package exercises.hackerrank;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ClimbingLeaderBoard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int i = 0;
        Set<Integer> set = Arrays.stream(scores).boxed().collect(Collectors.toSet());
        int[] scores2 = new int[set.size()];
        for (Integer k : set) {
            scores2[i++] = k;
        }
        Arrays.sort(scores2);

        int[] result = new int[alice.length];

        for (i = 0; i < alice.length; i++) {
            int s = 0;
            int f = scores2.length - 1;
            while (true) {

                if (s == f) {
                    if (alice[i] < scores2[s]) {
                        result[i] = scores2.length - s + 1;
                    } else if (alice[i] == scores2[s]) {
                        result[i] = scores2.length - s;
                    } else {
                        result[i] = scores2.length - s;
                    }
                    break;
                }

                int mid = (f + s) / 2;

                if (alice[i] > scores2[mid]) {
                    s = mid + 1;

                } else {
                    f = mid;
                }

            }
        }
        return result;
    }
}
