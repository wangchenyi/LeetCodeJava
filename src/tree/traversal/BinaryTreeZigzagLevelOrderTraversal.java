package tree.traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchenyi on 2017/8/2.
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private void levelOrder(TreeNode root, int level, List<List<Integer>> result, boolean leftToRight) {
        if (null != root) {
            if (result.size() < level)
                result.add(new ArrayList<Integer>());

            if (leftToRight)
                result.get(level - 1).add(root.val);
            else
                result.get(level - 1).add(0, root.val);
            levelOrder(root.left, level + 1, result, !leftToRight);
            levelOrder(root.right, level + 1, result, !leftToRight);
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, 1, result, true);
        return result;
    }
}
