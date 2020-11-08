package com.company.LC673;

import java.util.ArrayList;
import java.util.List;

public class NumberOfLongestIncreasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int size = nums.length;
        if (size == 0) return 0;
        if (size == 1) return 1;

        List<int[]>[] lists = (List<int[]>[]) new ArrayList[size + 1];
        lists[1] = new ArrayList<>();
        lists[1].add(new int[]{nums[0], 1});

        int len = 1;
        for (int i = 1; i < size; i++) {
            int n  = nums[i];
            int l = 1, r = len + 1;
            while (l < r) {
                int mid = l + (r - l) / 2;
                List<int[]> curr = lists[mid];
                if (curr.get(curr.size() - 1)[0] >= n) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }

            if (l - 1 == len) {
                lists[++len] = new ArrayList<>();
            }

            int count = 0;
            if (l - 1 > 0) {
                List<int[]> pre = lists[l - 1];
                int hi = -1, lo = pre.size() - 1;
                while (lo > hi) {
                    int mi = lo + (hi - lo) / 2;
                    if (pre.get(mi)[0] >= n) {
                        hi = mi;
                    } else {
                        lo = mi - 1;
                    }
                }
                count = pre.get(pre.size() - 1)[1] - (lo >= 0 ? pre.get(lo)[1] : 0);
            } else count = 1;

            List<int[]> list = lists[l];
            count = count + (list.size() == 0 ? 0 : list.get(list.size() - 1)[1]);
            list.add(new int[]{n, count});
        }

        return lists[len].get(lists[len].size() - 1)[1];
    }
}

