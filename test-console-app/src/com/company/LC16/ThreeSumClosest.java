package com.company.LC16;

import java.util.Arrays;

public class ThreeSumClosest {
/*
    Time Complexity: O(n^2)
    Space Complexity: from O(log(n)) to O(n)
*/
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, size = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < size && diff != 0; ++i) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int lo = i + 1, hi = size - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];

                if(sum == target) return sum;

                if (Math.abs(target - sum) < Math.abs(diff))
                    diff = target - sum;
                if (sum < target)
                    ++lo;
                else
                    --hi;
            }
        }
        return target - diff;
    }

/*
    Time Complexity: O(n^2 * log(n))
    Space Complexity: from O(log(n)) to O(n)
*/

    public int threeSumClosestBinary(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, size = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < size && diff != 0; ++i) {
            for (int j = i + 1; j < size - 1; ++j) {
                int complement = target - nums[i] - nums[j];
                int idx = Arrays.binarySearch(nums, j + 1, size - 1, complement);
                int hi = idx >= 0 ? idx : ~idx, lo = hi - 1;
                if (hi < size && Math.abs(complement - nums[hi]) < Math.abs(diff))
                    diff = complement - nums[hi];
                if (lo > j && Math.abs(complement - nums[lo]) < Math.abs(diff))
                    diff = complement - nums[lo];
            }
        }
        return target - diff;
    }
}
