package com.company.LC213;

import java.util.Arrays;

public class HouseRobberII {
    int[] nums;
    int[][] cache;

    public int rob(int[] nums) {
        this.nums = nums;
        this.cache = new int[2][nums.length+2];

        Arrays.fill(this.cache[0],-1);
        Arrays.fill(this.cache[1],-1);

        return robRec(0,0);
    }

    private int robRec(int index, int firstHouseRobbed) {
        if(cache[firstHouseRobbed][index]==-1) {
            if(index>=nums.length) { // outside of boundry
                cache[firstHouseRobbed][index] = 0;
            }
            else { // recursive
                int way1 = 0;
                int way2 = 0;

                // rob current house
                if(index<nums.length-1 || firstHouseRobbed==0) { // check for last house compared to first house
                    way1 = nums[index]+robRec(index+2,index==0?1:firstHouseRobbed);
                }

                // rob next house
                way2 = robRec(index+1,firstHouseRobbed);

                cache[firstHouseRobbed][index] = Math.max(way1,way2);
            }
        }
        return cache[firstHouseRobbed][index];
    }
}
