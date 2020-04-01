package exercises.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// # 554 LC
public class BrickWall {
  public int leastBricks(List<List<Integer>> wall) {
    Map<Integer, Integer> crossing = new HashMap();

    int maxCount = 0;

    for (List<Integer> row : wall) {
      int lenSoFar = 0;
      for (int blockIdx = 0; blockIdx < row.size() - 1; blockIdx++) {
        int block = row.get(blockIdx);
        lenSoFar += block;
        crossing.put(lenSoFar, crossing.getOrDefault(lenSoFar, 0) + 1);

        maxCount = Math.max(maxCount, crossing.get(lenSoFar));
      }
    }

    return wall.size() - maxCount;
  }
}
