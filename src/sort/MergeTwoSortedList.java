package sort;

/**
 * Created by wangchenyi on 2017/7/28.
 */
public class MergeTwoSortedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(null != l2 && null != l1){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (null != l1) ? l1 : l2;
        return res.next;
    }

    public static void main(String[] args){

    }

}
