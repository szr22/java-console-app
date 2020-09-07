package com.company.LC835;

public class ImageOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        int length = A.length;
        int result = 0;
        for (int row=-length; row<length; row++) {
            for (int col=-length; col<length; col++) {
                result = Math.max(result, count(A, B, row, col));
            }
        }

        return result;
    }

    private int count(int[][] A, int[][] B, int row, int col) {
        int counter = 0;
        for (int r=0; r<A.length; r++) {
            for (int c=0; c<A.length; c++) {
                if(r+row<0 || r+row>=A.length || c+col<0 || c+col>=B.length) {
                    continue;
                }

                if(A[r+row][c+col]==1 && B[r][c]==1) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
