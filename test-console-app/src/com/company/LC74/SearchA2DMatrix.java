package com.company.LC74;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        while( left <= right ){
            if (get(matrix, left) == target){
                return true;
            }
            int mid = (left+right)/2;
            int val = get(matrix, mid);

            if (val<target){
                left = mid +1;
            }else if (val>target){
                right = mid-1;
            }else{
                return true;
            }
        }

        return false;
    }

    private int get(int[][] matrix, int pos) {
        int row = pos / matrix[0].length;
        int col = pos % matrix[0].length;

        return matrix[row][col];
    }
}
