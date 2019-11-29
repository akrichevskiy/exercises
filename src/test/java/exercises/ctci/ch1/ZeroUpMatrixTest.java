package exercises.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZeroUpMatrixTest {

  @Test
  public void test() {
    ZeroUpMatrix zeroUpMatrix = new ZeroUpMatrix();
    int[][] a = {
      {0, 1},
      {1, 1}
    };
    int[][] expected = {
      {0, 0},
      {0, 1}
    };

    zeroUpMatrix.zeroUp(a);
    assertArrayEquals(expected, a);
  }

  @Test
  public void test2() {
    ZeroUpMatrix zeroUpMatrix = new ZeroUpMatrix();
    int[][] a = {
      {1, 1, 2},
      {1, 0, 2},
      {1, 1, 2}
    };
    int[][] expected = {
      {1, 0, 2},
      {0, 0, 0},
      {1, 0, 2}
    };

    zeroUpMatrix.zeroUp(a);
    assertArrayEquals(expected, a);
  }
}
