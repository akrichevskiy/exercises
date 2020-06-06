package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QueueReconstructionByHeightTest {

  private QueueReconstructionByHeight sut = new QueueReconstructionByHeight();

  @Test
  public void test1() {
    int[][] expected = new int[][] {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
    int[][] people =
        new int[][] {
          {5, 0},
          {7, 1},
          {5, 2},
          {4, 4},
          {6, 1},
          {7, 0}
        };
    int[][] actuals = sut.reconstructQueue(people);
    System.out.println(Arrays.deepToString(actuals));
    assertArrayEquals(expected, actuals);
  }
}
