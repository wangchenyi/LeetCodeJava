package tree.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wangchenyi on 2017/7/31.
 */
public class BinaryTreePreorderTraversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (root != null){
            result.add(root.val);
            if(root.left !=null && root.right != null){
                stack.push(root);
                root = root.left;
            } else if(root.left != null)
                root = root.left;
            else if(root.right != null)
                root = root.right;
            else if(stack.size() != 0)
                root = stack.pop().right;
            else
                break;
        }
        return result;
    }

    // 方法二
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(null != root)
            stack.push(root);

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(null != node.left) stack.push(node.left);
            if(null != node.right) stack.push(node.right);
        }
        return result;
    }

    public static void main(String[] args){
        Stack<TreeNode> stack = new Stack<TreeNode>();

        //stack.push();
        System.out.println(stack.size());
        stack.pop();
    }

}
