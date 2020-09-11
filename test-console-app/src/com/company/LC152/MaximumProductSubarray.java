package com.company.LC152;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null)
            return 0;

        int prod = 1;
        int res = nums[0];
        for(int i=0; i<nums.length; i++){
            prod *= nums[i];
            res = Math.max(res, prod);
            if (nums[i]==0)
                prod = 1;
        }

        prod = 1;
        for(int i=nums.length-1; i>-1; i--){
            prod *= nums[i];
            res = Math.max(res, prod);
            if (nums[i]==0)
                prod = 1;
        }

        return res;
    }
}
