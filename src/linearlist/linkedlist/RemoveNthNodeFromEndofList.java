package linearlist.linkedlist;

public class RemoveNthNodeFromEndofList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;

        ListNode fast = head;
        ListNode zero = new ListNode(0);
        zero.next = head;
        ListNode slow = zero;
        while (fast != null && n > 0){
            fast = fast.next;
            n--;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = tmp.next;
        tmp.next = null;

        return zero.next;
    }

}
