package com.company.LC134;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans = 0, filled = 0, required = 0;
        for(int i = 0; i < gas.length; i++){
            filled += gas[i] - cost[i];
            if(filled < 0){
                required += filled;
                ans = i + 1;
                filled = 0;
            }
        }
        return filled >= Math.abs(required) ? ans : -1;
    }
}
