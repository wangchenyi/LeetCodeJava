package sort;

/**
 * Created by wangchenyi on 2017/7/28.
 */
public class MergeKSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoListsN(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);

        for(ListNode cur = res; l1 != null || l2 != null; cur = cur.next){
            int val1 = l1 == null ? Integer.MAX_VALUE : l1.val;
            int val2 = l2 == null ? Integer.MAX_VALUE : l2.val;
            if(val1 <= val2){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }

        }
        return res.next;
    }

    // 递归过于耗时了
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        ListNode node = lists[0];
        for(int i = 1; i < lists.length; i ++){
            node = mergeTwoListsN(node, lists[i]);
        }
        return node;
    }

    public static void main(String[] args){

    }

}
