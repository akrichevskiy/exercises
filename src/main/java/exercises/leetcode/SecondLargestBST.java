package exercises.leetcode;

public class SecondLargestBST {
    public int secondLargestBST(TreeNode root) {
        if (root == null) {
            return -1;
        }
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur.right != null) {
            prev = cur;
            cur = cur.right;
        }

        if(cur.left != null) {
            cur = cur.left;
            while(cur.right != null) {
                cur = cur.right;
            }
            return cur.val;
        } else  {
            return prev == null ? -1: prev.val;
        }
    }
}
