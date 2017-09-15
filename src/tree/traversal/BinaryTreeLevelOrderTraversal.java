package tree.traversal;

import java.util.*;

/**
 * Created by wangchenyi on 2017/8/2.
 */
public class BinaryTreeLevelOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private void levelOrder(TreeNode root, int level, List<List<Integer>> result){
        if(null != root){
            if(result.size() < level)
                result.add(new ArrayList<Integer>());

            result.get(level-1).add(root.val);
            levelOrder(root.left, level + 1, result);
            levelOrder(root.right, level + 1, result);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, 1, result);
        return result;
    }


}
