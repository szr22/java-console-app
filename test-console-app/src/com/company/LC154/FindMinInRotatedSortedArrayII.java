package com.company.LC154;

public class FindMinInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int low = 0, high = nums.length - 1;
        int min = Math.min(nums[low], nums[high]);

        while (low <= high) {
            while (low <= high && nums[low] == nums[low+1]) {
                low++;
            }
            while (high > low && nums[high-1] == nums[high]) {
                high--;
            }
            int mid = low + (high-low)/2;
            min = Math.min(min, nums[mid]);
            if (nums[mid]>nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return min;
    }
}
