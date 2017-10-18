import java.util.List;

/**
 * Created by ifhunter on 2017/8/23.
 */

public class No2_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        l1.val=2;
        l1.next = new ListNode(0);
        l1.next.val=4;
        l1.next.next = new ListNode(0);
        l1.next.next.val=3;
        l1.next.next.next=null;
        l2.val=5;
        l2.next = new ListNode(0);
        l2.next.val=6;
        l2.next.next = new ListNode(0);
        l2.next.next.val=4;
        l2.next.next.next=null;
        ListNode result ;
        No2_AddTwoNumbers problem = new No2_AddTwoNumbers();
        result = problem.addTwoNumbers(l1, l2);
        System.out.println(l1.val+"->"+l1.next.val+"->"+l1.next.next.val+"+"
        +l2.val+"->"+l2.next.val+"->"+l2.next.next.val+"="+result.val+"->"+result.next.val+"->"+result.next.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p=l1,q=l2,curr=dummyHead;
        int carry=0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry=sum/10;
            curr.next = new ListNode(sum % 10);
            curr=curr.next;
            if (p != null) p=p.next;
            if(q!=null) q=q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
}

