package com.company.util;

import java.util.List;

public class Helper {
    public static int[] convertIntegers(List<Integer> integers){
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static ListNode convertArrayToListNode(int[] nums){
        ListNode cur = new ListNode(0);
        ListNode fakeHead = cur;
        for (int num: nums){
            ListNode nex = new ListNode(num);
            cur.next = nex;
            cur = cur.next;
        }
        return fakeHead.next;
    }
}
