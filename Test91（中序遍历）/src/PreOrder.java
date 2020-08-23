import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class PreOrder {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> preOrder(TreeNode root){
        if (root == null) {
            return null;
        }
        list.add(root.val);
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
        return list;
    }

    public List<Integer> preOrder2(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
         while (cur != null || !stack.isEmpty()) {
             while (cur != null) {
                 list.add(cur.val);
                 stack.add(cur);
                 cur = cur.left;
             }
             cur = stack.pop();
             cur = cur.right;
         }
         return list;
    }
}
