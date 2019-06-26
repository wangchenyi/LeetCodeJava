package algorithms.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 套路：二叉树，递归就完了
 */

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int mid = nums[nums.length / 2];
        TreeNode node = new TreeNode(mid);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
        if (nums.length - 1 >= nums.length / 2 + 1) {
            node.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
        }
        return node;
    }

}
