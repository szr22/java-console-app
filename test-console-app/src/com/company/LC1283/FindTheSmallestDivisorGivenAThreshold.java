package com.company.LC1283;

public class FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int num : nums){
            max = Math.max(num, max);
        }
        int left = 1;
        int right = max;
        while(left < right){
            int mid = left + (right - left)/2;
            int res = 0;
            for(int num : nums){
                res += (num + mid - 1) / mid;
            }
            if(res <= threshold){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
