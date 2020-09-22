package com.company.LC229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length/3;
        System.out.println(threshold);
        HashMap<Integer, Integer> num_counts = new HashMap();
        ArrayList numbers = new ArrayList();
        for (int x:nums) {
            if(num_counts.containsKey(x)==false){
                num_counts.put(x,1);
            } if (num_counts.get(x)>threshold && numbers.contains(x)==false) {
                numbers.add(x);
            } else {
                int curr = num_counts.get(x);
                num_counts.replace(x, curr+1);
            }
        }
        return numbers;
    }
}
