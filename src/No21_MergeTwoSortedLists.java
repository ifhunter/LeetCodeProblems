/**
 * Created by ifhunter on 2017/10/16.
 */
public class No21_MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(9);
        l1.next=l3;
        l3.next=l5;
        l2.next=l4;
        ListNode nl = mergeTwoLists(l1, l2);
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakehead = new ListNode(-1);
        ListNode l3=fakehead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            } else {
                l3.next=l2;
                l3=l3.next;
                l2=l2.next;
            }
        }
        if(l1!=null)
            l3.next=l1;
        if(l2!=null)
            l3.next=l2;
        return fakehead.next;
    }
}
