package sort;

/**
 * Created by wangchenyi on 2017/7/28.
 */
public class InsertionSortList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode insertionSortList(ListNode head) {

        if (head == null)
            return null;
        else if(head.next == null)
            return head;
        else {
            ListNode sorted = insertionSortList(head.next);
            if (head.val <= sorted.val) {
                head.next = sorted;
                return head;
            } else {
                ListNode front = sorted;
                ListNode next = sorted.next;
                while (next != null && next.val < head.val) {
                    front = next;
                    next = next.next;
                }
                front.next = head;
                head.next = next;
                return sorted;
            }
        }
    }

    public static void main(String[] args){

    }

}
