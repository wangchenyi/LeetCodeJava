package tree.traversal;

/**
 * Created by wangchenyi on 2017/8/9.
 */
public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return balanceHight(root) >= 0;
    }

    private int balanceHight(TreeNode root) {
        if(null == root)
            return 0;
        int lh = balanceHight(root.left);
        int rh = balanceHight(root.right);
        if(lh == -1 || rh == -1 || Math.abs(lh - rh) > 1)
            return -1;
        return Math.max(lh, rh) + 1;
    }


}
