package com.company.LC57;

import java.util.Arrays;
import java.util.Comparator;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int startIdx = Arrays.binarySearch(intervals, newInterval, new Comparator<int[]>() {
            public int compare(int[] src, int[] k) {
                return src[0] - k[0];
            }
        });

        int endIdx = Arrays.binarySearch(intervals, newInterval, new Comparator<int[]>() {
            public int compare(int[] src, int[] k) {
                return src[0] - k[1];
            }
        });

        int start = startIdx < 0 ? -(startIdx + 1) : startIdx + 1;
        int end = endIdx < 0 ? -(endIdx + 1) : endIdx + 1;

        int len = intervals.length - end + start;
        int pivot = start - 1;
        if (start == 0 || newInterval[0] > intervals[start-1][1]) {
            pivot = pivot + 1;
            len = len + 1;
        }
        if (start == 0 && end != 0) {
            intervals[0][0] = Math.min(newInterval[0], intervals[0][0]);
        }
        int[][] newIntervals = new int[len][2];
        for (int i=0; i < pivot; i++) {
            newIntervals[i] = intervals[i];
        }
        if (end == 0 || pivot == intervals.length) {
            newIntervals[pivot] = newInterval;
        } else {
            newIntervals[pivot][0] = Math.min(newInterval[0], intervals[pivot][0]);
            newIntervals[pivot][1] = Math.max(newInterval[1], intervals[end-1][1]);
        }
        for (int i=end; i < intervals.length; i++) {
            newIntervals[++pivot] = intervals[i];
        }
        return newIntervals;
    }
}
