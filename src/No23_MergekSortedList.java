/**
 * Created by ifhunter on 2017/10/18.
 */

import java.util.*;

public class No23_MergekSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(9);
        l1.next = l3;
        l3.next = l5;
        l2.next = l4;
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        list.add(l1);
        list.add(l2);
        ListNode res ;
        res = mergeKLists(list);
    }

    static ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.size() == 0)
            return null;
        return MSort(lists, 0, lists.size() - 1);
    }

    static ListNode MSort(ArrayList<ListNode> lists, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            ListNode leftlist = MSort(lists, low, mid);
            ListNode rightlist = MSort(lists, mid + 1, high);
            return mergeTwoLists(leftlist, rightlist);
        }
        return lists.get(low);
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode l3;
        if (l1.val < l2.val) {
            l3 = l1;
            l1 = l1.next;
        } else {
            l3=l2;
            l2=l2.next;
        }
        ListNode fakehead = new ListNode(-1);
        fakehead.next=l3;
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
