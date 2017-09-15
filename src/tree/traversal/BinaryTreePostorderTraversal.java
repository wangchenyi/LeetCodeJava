package tree.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wangchenyi on 2017/8/1.
 */
public class BinaryTreePostorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        do{
            while (null != node){
                stack.push(node);
                node = node.left;
            }
            TreeNode visited = null;
            while (!stack.isEmpty()){
                node = stack.pop();
                if(node.right == visited){// 右支不存在或者已被访问
                    result.add(node.val);
                    visited = node;// 记录已访问的节点
                } else {
                    stack.push(node);// 二次入栈，先遍历右支
                    node = node.right;
                    break;
                }
            }
        }while (!stack.isEmpty());
        return result;
    }
}
