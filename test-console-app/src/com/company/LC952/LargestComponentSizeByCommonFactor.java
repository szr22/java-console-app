package com.company.LC952;

import java.util.*;

public class LargestComponentSizeByCommonFactor {
    private int[] roots;
    public int largestComponentSize(int[] A) {
        int maxNum = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : A) maxNum = Math.max(maxNum, num);
        roots = new int[maxNum+1];
        for (int i = 1; i <= maxNum; ++i) roots[i] = i;

        for (int num : A) {
            for (int d = (int)Math.sqrt(num); d >= 2; --d) {
                if (num % d == 0) {
                    union(num, d);
                    union(num, num/d);
                }
            }
        }

        for (int num : A) {
            int key = find(num);
            int value = map.getOrDefault(key, 0);
            map.put(key, ++value);
            res = Math.max(res, value);
        }

        return res;
    }

    private int find(int num) {
        while(roots[num] != num) { // get root
            roots[num] = roots[roots[num]];
            num = roots[num];
        }
        return num;
    }

    private void union(int x, int y){
        roots[find(x)] = roots[find(y)];
    }
}