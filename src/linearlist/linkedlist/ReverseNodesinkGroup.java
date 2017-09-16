package linearlist.linkedlist;

public class ReverseNodesinkGroup {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 2)
            return head;
        ListNode zero = new ListNode(0);
        zero.next = head;
        for(ListNode pre = zero, end = head; end != null; end = pre.next){
            for(int i = 1; i < k && end != null; i++){
                end = end.next;
            }
            if( end == null ) break;

            pre = reverse(pre, pre.next, end);
        }
        return zero.next;
    }

    private ListNode reverse(ListNode pre, ListNode begin, ListNode end){
        ListNode endNext = end.next;
        for (ListNode p = begin, cur = begin.next, next = cur.next;
             cur != endNext;
             p = cur, cur = next, next = next == null ? null : next.next) {
            cur.next = p;
        }
        pre.next = end;
        begin.next = endNext;
        return begin;
    }

}
