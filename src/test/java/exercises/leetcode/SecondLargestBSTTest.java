package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondLargestBSTTest {
  private SecondLargestBST secondLargestBST = new SecondLargestBST();
    @Test
  public void oneNode() {
      assertEquals(-1, secondLargestBST.secondLargestBST(new TreeNode(1)));
  }

  @Test
  public void testOne() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
      assertEquals(2, secondLargestBST.secondLargestBST(root));
  }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode right2 = new TreeNode(5);
        right1.right = right2;
        root.right = right1;
        assertEquals(3, secondLargestBST.secondLargestBST(root));
    }

    @Test
    public void testThree() {
        TreeNode root = new TreeNode(7);
        TreeNode right1 = new TreeNode(15);
        TreeNode left = new TreeNode(10);
        right1.left = left;
        root.right = right1;
        assertEquals(10, secondLargestBST.secondLargestBST(root));
    }
}
