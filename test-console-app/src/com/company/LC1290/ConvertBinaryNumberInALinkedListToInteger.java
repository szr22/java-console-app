package com.company.LC1290;

import com.company.util.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int sum=0;
        while(head!=null){
            sum=sum*2+head.val;
            head=head.next;
        }
        return sum;
    }
}
