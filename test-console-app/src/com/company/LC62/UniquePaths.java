package com.company.LC62;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if(n<=1) return n;

        int[] dp = new int[m];
        Arrays.fill(dp, 1);

        for(int row=1; row<n; row++){
            int[] curDp = new int[m];
            Arrays.fill(curDp, 1);

            for(int col=1; col<m; col++)
                curDp[col] = curDp[col-1]+dp[col];

            dp = curDp;
        }
        return dp[m-1];
    }
}
