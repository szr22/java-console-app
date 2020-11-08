package com.company.LC1217;

public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int i:position)
            if(i%2==0)
                even++;
        return Math.min(even,position.length-even);
    }
}
