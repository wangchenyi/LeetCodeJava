package linearlist.linkedlist;

public class RotateList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        if(k == 0)
            return head;
        int length = 1;
        ListNode cur;
        for(cur = head; cur.next != null; cur = cur.next){
            length++;
        }
        int step = length - k % length;
        if(step == 0)
            return head;
        cur.next = head;
        while (step> 0){
            cur = cur.next;
            step--;
        }
        head = cur.next;
        cur.next = null;
        return head;
    }

}
