/**
 * Created by ifhunter on 2017/10/20.
 */
public class No24_SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(9);
        l1.next = l3;
        l3.next = l5;
        l2.next = l4;
        ListNode res = swapPairs(l1);
    }

    static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode fakehead = new ListNode(-1);
        fakehead.next=head;
        ListNode ptr1=fakehead;
        ListNode ptr2=head;
        while (ptr2 != null && ptr2.next != null) {
            ListNode nextstart=ptr2.next.next;
            ptr2.next.next=ptr2;
            ptr1.next=ptr2.next;
            ptr2.next=nextstart;
            ptr1=ptr2;
            ptr2=ptr2.next;
        }
        return fakehead.next;
    }
}
