package exercises.leetcode;

public class SegmentTree {
    private int [] tree;

    public SegmentTree(int[] a) {
        tree = new int[2* a.length];
        construct(a, 0, 0, a.length - 1);
    }
    public void construct(int[] a, int treeIndex, int lo, int hi) {
        if (lo == hi) {
            tree[treeIndex] = a[lo];
            return;
        }
        int mid = lo + (hi  - lo) / 2;
        construct(a, 2 * treeIndex + 1, lo, mid);
        construct(a, 2* treeIndex + 2, mid + 1, hi);

        tree[treeIndex] = merge(tree[2 * treeIndex + 1], tree[2* treeIndex + 2]);
    }

    private int merge(int a, int b) {
        return a + b;
    }

    public int[] getTree() {
        return tree;
    }
}
