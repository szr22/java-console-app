package com.company.LC220;

import java.util.TreeMap;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        TreeMap<Long, Integer> map = new TreeMap<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i - j > k) {
                if(contains(map, nums, j, t)) return true;
                j++;
            }
            long val = nums[i];
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        while(j < nums.length) {
            if(contains(map, nums, j, t)) return true;
            j++;
        }
        return false;
    }

    private boolean contains(TreeMap<Long, Integer> map, int[] nums, int j, int t) {

        long val = nums[j];
        Integer count = map.get(val);
        Long diff;
        if(count != null && count > 1) {
            map.put(val, count - 1);
        } else {
            map.remove(val);
        }
        if((diff = map.floorKey(t + val)) != null && Math.abs(diff - nums[j]) <= t) return true;
        return false;
    }
}