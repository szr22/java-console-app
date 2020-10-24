package com.company.LC189;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length > 1){
            if(k >= nums.length) {
                // The Array returns to it's original form after every nums.length Rotation.
                k = k % nums.length;
                if (k == 0) {
                    return;
                }
            }
            getRotationArr(nums, k);
        }
    }

    private void getRotationArr(int[] nums, int k) {
        int resultArr[] = new int[nums.length];
        int pointer = 0;
        for(int index = nums.length - k; index < nums.length; index++){
            resultArr[pointer] = nums[index];
            pointer++;
        }
        for(int index = 0; index < nums.length - k; index++){
            resultArr[pointer] = nums[index];
            pointer++;
        }
        for(int index = 0; index < nums.length; index++){
            nums[index] = resultArr[index];
        }
    }
}
