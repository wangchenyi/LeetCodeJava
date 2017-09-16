package linearlist.linkedlist;

public class RemoveDuplicatesfromSortedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = null;
            for(ListNode pre = head; pre != null && pre.next != null; ){
                cur = pre.next;
                if(cur.val == pre.val){
                    pre.next = cur.next;
                    cur.next = null;
                } else {
                    pre = pre.next;
                }
            }

        return head;
    }
}
