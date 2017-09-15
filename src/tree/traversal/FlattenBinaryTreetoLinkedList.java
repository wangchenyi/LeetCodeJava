package tree.traversal;

/**
 * Created by wangchenyi on 2017/8/9.
 */
public class FlattenBinaryTreetoLinkedList {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode flattenBinary(TreeNode root){
        if(null == root)
            return null;
        TreeNode ln = flattenBinary(root.left);
        TreeNode rn = flattenBinary(root.right);
        root.left = null;
        root.right = rn;
        if(null != ln){
            TreeNode cur = ln;
            while (null != cur.right)
                cur = cur.right;
            root.right = ln;
            cur.right = rn;
        }
        return root;
    }

    public void flatten(TreeNode root) {
        flattenBinary(root);
    }


}
