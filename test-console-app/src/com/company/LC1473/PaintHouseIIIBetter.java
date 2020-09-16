package com.company.LC1473;

public class PaintHouseIIIBetter {
    int[] houses;
    int[][] cost;
    int[][][] states;
    int n;

    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        this.states=new int[m][n+2][target+1];
        this.houses=houses;
        this.cost=cost;
        this.n=n;
        int res = dfs(0,n+1,target);
        return res==Integer.MAX_VALUE?-1:res;
    }

    private int dfs(int i,int p,int t){
        if(i==houses.length || t<0 || houses.length-i<t){
            return i==houses.length && t==0?0:Integer.MAX_VALUE;
        }
        if(states[i][p][t]>0){
            return states[i][p][t];
        }
        if(houses[i]==0){
            int min=Integer.MAX_VALUE;
            for(int c=1;c<=n;c++){
                int cur=0;
                if(c==p){
                    cur=dfs(i+1,c,t);
                }else{
                    cur=dfs(i+1,c,t-1);
                }
                if(cur!=Integer.MAX_VALUE){
                    min=Math.min(min,cur+cost[i][c-1]);
                }
            }
            states[i][p][t]=min;
        }else{
            states[i][p][t]=houses[i]==p?dfs(i+1,p,t):dfs(i+1,houses[i],t-1);
        }
        return states[i][p][t];
    }
}
