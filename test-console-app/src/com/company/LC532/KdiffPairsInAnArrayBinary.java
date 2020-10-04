package com.company.LC532;

import java.util.Arrays;

public class KdiffPairsInAnArrayBinary {
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0 || k<0) return 0;
        Arrays.sort(nums);
        int pairs = 0;
        int index = 0;
        if(binarySearch(nums, 1, nums.length-1 , nums[0]+k) != -1){
            pairs++;
        }

        for(int i =1;i<nums.length; ++i){
            if(nums[i-1] != nums[i] && binarySearch(nums, i+1, nums.length-1 , nums[i]+k) != -1){
                pairs++;
            }
        }

        return pairs;
    }

    private int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
