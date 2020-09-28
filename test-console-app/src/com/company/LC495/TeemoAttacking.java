package com.company.LC495;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int poisonDuration = n * duration;

        for(int i=0; i<n-1; i++){
            int diff = timeSeries[i+1] - timeSeries[i];
            if(diff<duration){
                poisonDuration -= duration - diff;
            }
        }

        return poisonDuration;
    }
}
