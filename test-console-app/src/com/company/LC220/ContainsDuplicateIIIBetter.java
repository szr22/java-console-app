package com.company.LC220;

import java.util.TreeSet;

public class ContainsDuplicateIIIBetter {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int len = nums.length;

        // return false when given parameters makes two distinct indices impossible
        if (len <= 1 || k <= 0) {
            return false;
        }

        /**
         * Important, question definition:
         *   Absolute diff between nums[i] and nums[j] <= t
         *   Absolute diff between indices i and j <= k
         **/

        TreeSet<Long> set = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            Long number = new Long(nums[i]);
            Long ceil = set.ceiling(number);
            Long floor = set.floor(number);

            if (ceil != null && ceil - number <= t) {
                return true;
            }

            if (floor != null && number - floor <= t) {
                return true;
            }

            set.add(number);
            if (set.size() > k) {
                Long oldest = new Long(nums[i - k]);
                set.remove(oldest);
            }
        }

        return false;
    }
}
