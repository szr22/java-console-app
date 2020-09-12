package com.company.LC1;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i=0; i<nums.length; i++){
            int temp = target-nums[i];
            if (map.containsKey(temp)){
                res[0] = map.get(temp);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
