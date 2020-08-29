package com.company.FindRightInterval;

import java.util.Arrays;
import java.util.TreeMap;

public class FindRightIntervalSolution {
    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> starPoints = new TreeMap<>();
        for (int i = 0; i < intervals.length; i++){
            starPoints.put(intervals[i][0], i);
        }

        int[] res = new int[intervals.length];
        for (int i=0; i< intervals.length; i++) {
            Integer nextClosestStartPoint = starPoints.ceilingKey(intervals[i][1]);
            res[i] = nextClosestStartPoint==null ? -1 : starPoints.get(nextClosestStartPoint);
        }
        return res;
    }

    public int[] findRightIntervalBetter(int[][] intervals) {
        int minStartPoint = Integer.MAX_VALUE;
        int maxEndPoint = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            minStartPoint = Math.min(minStartPoint, intervals[i][0]);
            maxEndPoint = Math.max(maxEndPoint, intervals[i][1]);
        }

        int[] buckets = new int[maxEndPoint - minStartPoint + 1];
        Arrays.fill(buckets, -1);

        for (int i = 0; i < intervals.length; i++) {
            buckets[intervals[i][0] - minStartPoint] = i;
        }

        for (int i = buckets.length - 2; i > -1; i--) {
            if (buckets[i] == -1) {
                buckets[i] = buckets[i + 1];
            }
        }

        int[] rightIntervals = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            rightIntervals[i] = buckets[intervals[i][1] - minStartPoint];
        }

        return rightIntervals;
    }
}
