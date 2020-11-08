package com.company.LC445;

import com.company.util.ListNode;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverse(l1);
        ListNode it1 = revL1;
        ListNode it2 = reverse(l2);
        ListNode prev = null;
        int carry = 0;
        while(it1 != null || it2 != null){
            if(it1 == null){
                it1 = it2;
                it2 = null;
            }
            it1.val += ((it2 != null) ? it2.val : 0) + carry;
            carry = it1.val/10;
            it1.val %= 10;
            if(prev != null){
                prev.next = it1;
            }
            prev = it1;
            it1 = it1.next;
            if(it2 != null){
                it2 = it2.next;
            }
        }
        if(carry != 0){
            prev.next = new ListNode(carry);
        }
        return reverse(revL1);
    }

    private ListNode reverse(ListNode l){
        ListNode prev = null;
        ListNode cur = l;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
