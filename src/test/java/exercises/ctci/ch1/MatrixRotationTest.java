package exercises.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixRotationTest {

  @Test
  public void test() {
    int a[][] = {
      {1, 2},
      {3, 4}
    };
    int expected[][] = {
      {3, 1},
      {4, 2}
    };
    assertArrayEquals(expected, MatrixRotation.rotate(a));
  }

  @Test
  public void test2() {
    int a[][] = {{1}};
    int expected[][] = {{1}};
    assertArrayEquals(expected, MatrixRotation.rotate(a));
  }

  @Test
  public void test3() {
    int a[][] = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    int expected[][] = {
      {7, 4, 1},
      {8, 5, 2},
      {9, 6, 3}
    };
    assertArrayEquals(expected, MatrixRotation.rotate(a));
  }
}
