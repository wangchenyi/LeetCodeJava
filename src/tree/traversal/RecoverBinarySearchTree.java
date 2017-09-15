package tree.traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchenyi on 2017/8/3.
 */
public class RecoverBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private void inorderTraversal(TreeNode root, List<TreeNode> result) {
        if (root != null) {
            inorderTraversal(root.left, result);
            result.add(root);
            inorderTraversal(root.right, result);
        }
    }

    private void swap(TreeNode n1, TreeNode n2) {
        int tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
    }

    public void recoverTree(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        inorderTraversal(root, result);
        TreeNode first = null;
        TreeNode second = null;

        for (int i = 0; i < result.size() - 1; i++) {
            if (result.get(i).val > result.get(i + 1).val){
                first = result.get(i);
                break;
            }

        }
        for (int i = result.size() - 1; i > 0; i--) {
            if (result.get(i).val < result.get(i - 1).val){
                second = result.get(i);
                break;
            }
        }

        if (first != null && second != null)
            swap(first, second);
    }
}
