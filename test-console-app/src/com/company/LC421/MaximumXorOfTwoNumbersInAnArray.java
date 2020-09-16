package com.company.LC421;

import java.util.Arrays;

public class MaximumXorOfTwoNumbersInAnArray {
    public int findMaximumXOR(int[] nums) {
        Arrays.sort(nums);
        int o = 0;
        for (int n : nums) {
            o |= n;
        }
        int max = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            max = Math.max(max, nums[left] ^ nums[right]);
            if (o - nums[left] > nums[right]) { // Equivalent to: nums[i] ^ o > nums[j]
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
