package com.company.LC835;

public class ImageOverlapBetter {
    public int largestOverlap(int[][] A, int[][] B) {
        return Math.max(
            find(A, B, 0, 0, new boolean[A.length][A[0].length]),
            find(B, A, 0, 0, new boolean[A.length][A[0].length])
        );
    }

    private int find(int[][] A, int[][] B, int row, int col, boolean[][] mem) {
        if(row<0 || row>=A.length || col<0 || col>=A[0].length){
            return 0;
        }
        if(mem[row][col]){
            return 0;
        }
        mem[row][col] = true;
        int max = count(A, B, row, col);
        max = Math.max(max, find(A, B, row+1, col, mem));
        max = Math.max(max, find(A, B, row, col+1, mem));
        return max;
    }

    private int count(int[][] A, int[][] B, int row, int col) {
        int cnt = 0;
        for(int i=row; i<A.length; i++){
            for(int j=col; j<A[i].length; j++){
                cnt += (A[i][j]+B[i-row][j-col]) >> 1;
            }
        }
        return cnt;
    }
}
