package com.company.LC933;

import com.company.util.ListNode;

public class NumberOfRecentCalls {
    ListNode head;
    ListNode tail;
    int size;
    public NumberOfRecentCalls() {
        head = new ListNode(0);
        tail = head;
        size=0;
    }

    public int ping(int t) {
        tail.next = new ListNode(t);
        tail = tail.next;
        ListNode temp = head.next;
        size++;
        while (temp.val + 3000 < t) {
            size--;
            temp = temp.next;
            head = head.next;
        }
        return size;
    }
}
