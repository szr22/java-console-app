package com.company.LC1288;

import java.util.Arrays;

public class RemoveCoveredIntervalsSort {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0]? b[1] - a[1] : a[0] - b[0]);

        int count = 0, prevEnd = 0;
        for(int[] arr: intervals) {
            int end = arr[1];
            if(prevEnd < end) {
                count++;
                prevEnd = end;
            }
        }
        return count;
    }
}
