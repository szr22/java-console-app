package com.company.LC61;

import com.company.util.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;

        int length = getSize(head);
        k %= length;
        int i = 0;
        ListNode cur = head;
        ListNode finalHead = null;
        ListNode breakPoint = null;

        if(k==0)
            return head;

        while(cur.next!=null){
            if(i==length-k-1)
                breakPoint = cur;
            i++;
            cur = cur.next;
        }

        cur.next = head;
        finalHead = breakPoint.next;
        breakPoint.next = null;
        return finalHead;
    }

    private int getSize(ListNode node) {
        int count = 0;
        while(node!=null){
            count++;
            node = node.next;
        }

        return count;
    }
}
