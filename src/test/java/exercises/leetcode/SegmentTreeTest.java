package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SegmentTreeTest {

  @Test
  public void create() {
    SegmentTree tree = new SegmentTree(new int[] {1, 2, 3});
    System.out.println(Arrays.toString(tree.getTree()));
  }
}
