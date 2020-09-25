package com.company.LC179;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        sort(nums, 0, nums.length);

        if (nums[0] == 0) return "0";

        StringBuilder result = new StringBuilder();
        for (int num : nums) result.append(num);

        return result.toString();
    }

    private boolean compare(int a, int b) {
        long aLong = a * 10, bLong = b * 10;
        int x = a, y = b;

        while ((x /= 10) > 0) bLong *= 10;
        while ((y /= 10) > 0) aLong *= 10;

        return (aLong + b) > (bLong + a);
    }

    private void sort(int[] nums, int l, int r) {
        if (l >= r - 1) return ;
        int m = l + (r - l) / 2;

        sort(nums, l, m);
        sort(nums, m, r);
        merge(nums, l, m, r);
    }

    private void merge(int[] nums, int l, int m, int r) {
        int[] aux = new int[r - l];

        for (int i = l, j = m, k = 0; i < m || j < r;) {
            if (i < m && (j == r || compare(nums[i], nums[j]))) aux[k++] = nums[i++];
            else if (j < r) aux[k++] = nums[j++];
        }

        for (int i = 0; l < r; ++i) nums[l++] = aux[i];
    }
}
