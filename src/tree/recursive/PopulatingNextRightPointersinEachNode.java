package tree.recursive;

/**
 * Created by wangchenyi on 2017/8/9.
 */
public class PopulatingNextRightPointersinEachNode {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    private void connect(TreeLinkNode left, TreeLinkNode right) {
        if(null != left){
            left.next = right;
            connect(left.left, left.right);
            if(null != right){
                connect(left.right, right.left);
                connect(right, null);
            }
        }
    }

    public void connect(TreeLinkNode root) {
        connect(root, null);
    }

}
