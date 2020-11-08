package com.company.LC849;

public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int i = 0;
        int edge = -1;
        int count = 0;
        int middle = 0;
        while(i < seats.length){
            if(seats[i] == 0){
                i++;
                count++;
                if(i == seats.length){
                    edge = Math.max(edge, count);
                }
            }
            else{
                if(edge == -1)
                    edge = count;
                else{
                    middle = Math.max(middle, count);
                }
                count = 0;
                i++;
            }
        }
        return (middle+1)/2 > edge ? (middle+1)/2 : edge;
    }
}
