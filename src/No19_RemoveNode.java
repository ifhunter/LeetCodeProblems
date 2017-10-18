/**
 * Created by ifhunter on 2017/9/21.
 */
public class No19_RemoveNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        head.next=node1;
        ListNode newListNode = removeNthFromEnd(head, 1);
    }



    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;
        ListNode faster = head;
        ListNode slower = head;
        for(int i=0;i<n;i++)
            faster=faster.next;
        if (faster == null) {
            head=head.next;
            return head;
        }
        while (faster.next != null) {
            slower=slower.next;
            faster=faster.next;
        }
        slower.next=slower.next.next;
        return head;


    }

}

