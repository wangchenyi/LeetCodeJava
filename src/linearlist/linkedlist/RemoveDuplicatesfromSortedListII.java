package linearlist.linkedlist;

public class RemoveDuplicatesfromSortedListII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode zero = new ListNode(0);
        zero.next = head;
        ListNode pre = zero;
        boolean duplicate = false;
        while(pre.next != null){
            head = pre.next.next;
            while(head != null && pre.next.val == head.val){
                duplicate = true;
                head = head.next;
            }
            if(duplicate){
                duplicate = false;
                pre.next = head;
            }
            else {
                pre = pre.next;
            }
        }
        return zero.next;
    }

}
