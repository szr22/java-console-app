package com.company.LC456;

public class The132Pattern {
    public boolean find132pattern(int[] nums) {
        int[] rmax = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            rmax[i] = i + 1 < nums.length ? Math.max(rmax[i + 1], nums[i]) : nums[i];
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 2; i < nums.length; i++) {
            if (min > nums[i - 2] && (rmax[i] <= min || nums[i - 1] >= max)) {
                min = nums[i - 2];
                max = nums[i - 1];
            } else {
                max = Math.max(nums[i - 1], max);
            }
            if (min < nums[i] && nums[i] < max) {
                return true;
            }
        }
        return false;
    }
}
