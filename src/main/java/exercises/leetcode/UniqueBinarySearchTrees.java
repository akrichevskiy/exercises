package exercises.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UniqueBinarySearchTrees {
    public List<TreeNode> generateTrees(int n) {
        return go(1, n + 1);
    }

    private List<TreeNode> go(int from, int to) {
        if (from > to) {
            return Collections.emptyList();
        } else {
            List<TreeNode> result = new LinkedList<>();
            for (int i = from; i < to ; i++) {

                List<TreeNode> left = go(from, i);
                List<TreeNode> right = go(i + 1, to);

                if (left.isEmpty() && right.isEmpty()) {
                    TreeNode node = new TreeNode(i);
                    result.add(node);
                }  else if (left.isEmpty() ) {
                    for(TreeNode r: right){
                        TreeNode  node = new TreeNode(i);
                        node.right = r;
                        result.add(node);
                    }
                } else if( right.isEmpty()) {
                    for(TreeNode l: left){
                        TreeNode  node = new TreeNode(i);
                        node.left = l;
                        result.add(node);
                    }
                } else {
                    for(TreeNode r: right) {
                        for(TreeNode l: left) {
                            TreeNode  node = new TreeNode(i);
                            node.left = l;
                            node.right = r;
                            result.add(node);
                        }
                    }
                }

            }
            return result;
        }
    }
}
