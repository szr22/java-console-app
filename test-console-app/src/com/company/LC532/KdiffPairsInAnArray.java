package com.company.LC532;

import java.util.Arrays;

public class KdiffPairsInAnArray {
    int numPairs = 0;

    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        checkArray(nums, k);
        return numPairs;
    }

    private void checkArray(int[] nums, int k) {
        int i = 0;
        int j = 0;

        if (k < 0) {
            return;
        }

        while(i<nums.length && j < nums.length){
            if(i != j && nums[i]+k == nums[j]){
                numPairs++;
                while(j < nums.length && nums[i]+k == nums[j]) j++; //To eliminate duplicate
            }
            else if(nums[i] + k > nums[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }
}
