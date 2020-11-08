package com.company.LC147;

import com.company.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            int i = list.size() - 1;
            while (i >= 0 && node.val < list.get(i).val) {
                i--;
            }
            list.add(++i, node);
        }
        for (int i = 0; i < list.size(); ++i) {
            if (i + 1 < list.size()) {
                list.get(i).next = list.get(i + 1);
            }
        }
        list.get(list.size() - 1).next = null;

        return list.get(0);
    }

    public ListNode insertionSortListNoExtraSpace(ListNode head) {
        ListNode curr = head, next = null;
        // l is a fake head
        ListNode l = new ListNode(0);
        while (curr != null) {
            next = curr.next;
            ListNode p = l;
            while (p.next != null && p.next.val < curr.val)
                p = p.next;
            // insert curr between p and p.next
            curr.next = p.next;
            p.next = curr;
            curr = next;
        }
        return l.next;
    }

    public ListNode mergeSortList(ListNode head) {
        // NOTE : This is mergesort. Not insertion sort
        if(head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode preslow = null;


        while(fast != null && fast.next != null) {
            preslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        preslow.next = null;

        ListNode head1 = insertionSortList(head);
        ListNode head2 = insertionSortList(slow);

        ListNode prehead = new ListNode(0);
        ListNode current = prehead;

        while(head1!=null && head2 != null) {
            if(head1.val < head2.val){
                current.next = head1;
                head1 = head1.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if(head1!=null){
            current.next = head1;
        }

        if(head2!=null) {
            current.next = head2;
        }

        ListNode result = prehead.next;
        prehead.next = null;
        return result;
    }
}
