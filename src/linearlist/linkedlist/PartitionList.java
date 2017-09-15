package linkedlist;

public class PartitionList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode partition(ListNode head, int x) {

        ListNode less = new ListNode(-1);
        ListNode more = new ListNode(1);
        ListNode less_cur = less;
        ListNode more_cur = more;

        for(ListNode cur = head; cur != null; cur = cur.next){
            if(cur.val < x){
                less_cur.next = cur;
                less_cur = less_cur.next;
            } else {
                more_cur.next = cur;
                more_cur = more_cur.next;
            }
        }
        less_cur.next = more.next;
        more_cur.next = null;
        return less.next;
    }

}
