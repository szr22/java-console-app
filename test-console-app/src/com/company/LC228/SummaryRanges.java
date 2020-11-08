package com.company.LC228;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(null == nums || nums.length == 0)
            return list;
        boolean arrowInserted = false;
        int prev = nums[0];
        StringBuilder str = new StringBuilder();
        str.append(prev);
        for(int i = 1; i < nums.length; i++) {
            if(prev + 1 == nums[i]) {
                if(arrowInserted == false) {
                    str.append("->");
                    arrowInserted = true;
                }
            } else {
                if(arrowInserted)
                    str.append(prev);
                list.add(str.toString());
                str = new StringBuilder();
                str.append(nums[i]);
                arrowInserted = false;
            }
            prev = nums[i];
        }
        if(arrowInserted)
            str.append(prev);
        list.add(str.toString());
        return list;
    }
}
