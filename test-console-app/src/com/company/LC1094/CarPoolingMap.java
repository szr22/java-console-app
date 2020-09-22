package com.company.LC1094;

import java.util.Map;
import java.util.TreeMap;

public class CarPoolingMap {

/*
A simple idea is to go through from the start to end, and check if the actual capacity exceeds capacity.

To know the actual capacity, we just need the number of passengers changed at each timestamp.

We can save the number of passengers changed at each time, sort it by timestamp, and finally iterate it to check the actual capacity.

Algorithm

We will initialize a list to store the number of passengers changed and the corresponding timestamp and then sort it.

Note that in Java, we do not have a nice API to do this. However, we can use a TreeMap, which can help us to sort during insertion. You can use a PriorityQueue instead.

Finally, we just need to iterate from the start timestamp to the end timestamp and check if the actual capacity meets the condition.
*/
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> timestamp = new TreeMap<>();
        for (int[] trip : trips) {
            int start_passenger = timestamp.getOrDefault(trip[1], 0) + trip[0];
            timestamp.put(trip[1], start_passenger);

            int end_passenger = timestamp.getOrDefault(trip[2], 0) - trip[0];
            timestamp.put(trip[2], end_passenger);
        }
        int ued_capacity = 0;
        for (int passenger_change : timestamp.values()) {
            ued_capacity += passenger_change;
            if (ued_capacity > capacity) {
                return false;
            }
        }
        return true;
    }
}

/*
Complexity Analysis

Assume NN is the length of trips.

Time complexity: O(Nlog(N)) since we need to iterate over trips and sort our timestamp. Iterating costs O(N), and sorting costs O(N log(N)), and adding together we have O(N)+O(Nlog(N))=O(Nlog(N)).

Space complexity: O(N) since in the worst case we need O(N) to store timestamp.
*/
