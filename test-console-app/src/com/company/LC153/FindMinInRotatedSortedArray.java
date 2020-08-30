package com.company.LC153;

public class FindMinInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length==1)
            return nums[0];

        int low=0, high=nums.length-1;
        if (nums[0]<nums[high])
            return nums[0];

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];
            if(nums[mid-1]>nums[mid])
                return nums[mid];

            if(nums[mid]>nums[0])
                low = mid+1;
            else if(nums[mid]<nums[0])
                high = mid-1;
        }

        return 0;
    }
}
