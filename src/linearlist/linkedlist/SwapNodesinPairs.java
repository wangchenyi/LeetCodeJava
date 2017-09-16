package linearlist.linkedlist;

public class SwapNodesinPairs {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode zero = new ListNode(0);
        zero.next = head;
        for(ListNode pre = zero, cur = head, next = head.next;
            next != null;
            pre = cur, cur = cur.next, next = cur == null ? null : cur.next){
            pre.next = next;
            cur.next = next.next;
            next.next = cur;
        }
        return zero.next;

    }
}
