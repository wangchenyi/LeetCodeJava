package linearlist.linkedlist;

public class ReverseLinkedListII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null || m == n)
            return head;
        ListNode newNode = new ListNode(0);
        ListNode first = newNode;
        first.next = head;
        for(int i = 0; i < m - 1; i++){
                first = first.next;
        }
        ListNode pre = first.next;
        ListNode cur = pre.next;
        for(int i = m; i < n; i++){
            pre.next = cur.next;
            cur.next = first.next;
            first.next = cur;
            cur = pre.next;
        }
        return newNode.next;
    }

}
