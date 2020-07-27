class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    private int max = 0;

    public void TreeDepthHelper(TreeNode root, int curr) {
        if (root == null) {
            if (max < curr) {
                max = curr;
            }
            return;
        }
        TreeDepthHelper(root.left, curr + 1);
        TreeDepthHelper(root.right, curr + 1);
    }

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        TreeDepthHelper(root, depth);
        return max;
    }
}