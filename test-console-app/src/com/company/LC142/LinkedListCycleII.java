package com.company.LC142;

import com.company.util.ListNode;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        //floyd's hare and the tortoise algo
        ListNode hare = head;
        ListNode tor = head;
        while(hare!=null && hare.next!=null) {
            hare = hare.next.next;
            tor = tor.next;
            if(hare==tor) {
                tor = head;
                break;
            }
        }
        while(hare!=null && hare.next!=null) {
            if(hare==tor)
                return tor;
            hare = hare.next;
            tor = tor.next;
        }
        return null;
    }
}
