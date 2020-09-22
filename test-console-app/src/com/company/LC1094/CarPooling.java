package com.company.LC1094;

public class CarPooling {

/*
Note that in the problem there is a interesting constraint:

0 <= trips[i][1] < trips[i][2] <= 1000
What pops into the mind is Bucket Sort, which is a sorting algorithm in \mathcal{O}(N)O(N) time but requires some prior knowledge for the range of the data.

We can use it instead of the normal sorting in this method.

What we do is initial 1001 buckets, and put the number of passengers changed in corresponding buckets, and collect the buckets one by one.

Algorithm

We will initial 1001 buckets, iterate trip, and save the number of passengers changed at i mile in the i-th bucket.
*/
    public boolean carPooling(int[][] trips, int capacity) {
        int[] timestamp = new int[1001];
        for (int[] trip : trips) {
            timestamp[trip[1]] += trip[0];
            timestamp[trip[2]] -= trip[0];
        }
        int ued_capacity = 0;
        for (int number : timestamp) {
            ued_capacity += number;
            if (ued_capacity > capacity) {
                return false;
            }
        }
        return true;
    }
}

/*
Assume NN is the length of trip.

Time complexity: O(max(N,1001)) since we need to iterate over trips and then iterate over our 1001 buckets.

Space complexity : O(1001)=O(1) since we have 1001 buckets.
*/
