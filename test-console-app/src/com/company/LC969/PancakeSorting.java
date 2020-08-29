package com.company.LC969;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> res = new ArrayList<>();
        int curLength = A.length;
        while (curLength > 1) {
            if(isSorted(A)) {
                break;
            }
            int maxIndex = findMax(A, curLength);
            flipArr(A, maxIndex+1);
            res.add(maxIndex+1);
            flipArr(A, curLength);
            res.add(curLength);
            curLength--;
        }
        return res;
    }

    private void flipArr(int[] A, int pivot) {
        int low = 0;
        int high = pivot-1;
        while(low < high){
            swap(A, low, high);
            low++;
            high--;
        }
    }

    public void swap(int[] A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
        return;
    }

    private int findMax(int[] A, int lastIndex) {
        int max = Integer.MIN_VALUE;
        int retIndex = -1;
        for (int i=0; i<lastIndex; i++){
            if(A[i] >= max) {
                max = A[i];
                retIndex = i;
            }
        }
        return retIndex;
    }

    private boolean isSorted(int[] A) {
        for (int i=0; i<A.length-1; i++){
            if(A[i] > A[i+1]){
                return false;
            }
        }
        return true;
    }
}
