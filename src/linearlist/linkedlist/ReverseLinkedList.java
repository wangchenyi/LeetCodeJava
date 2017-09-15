package linearlist.linkedlist;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode cur = head;
        head = null;
        while(cur != null){
            next = cur.next;
            cur.next = head;
            head = cur;
            cur = next;
        }
        return head;
    }

}
