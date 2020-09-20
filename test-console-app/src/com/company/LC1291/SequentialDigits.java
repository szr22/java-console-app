package com.company.LC1291;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList();
        int start = String.valueOf(low).length(), end = String.valueOf(high).length();

        String numStr = "123456789";
        for(int c = start; c<=end; c++){
            for(int i=0, j=c; i<j && j<=9; i++, j++){
                String tmp = numStr.substring(i, j);
                int num = Integer.parseInt(tmp);
                if(num<low)
                    continue;
                if(num>high)
                    break;
                res.add(num);
            }
        }
        return res;
    }

    public List<Integer> sequentialDigitsBetter(int low, int high) {

        List<Integer> output = new ArrayList<Integer>();
        for(int i=1;i<10;i++){
            int num=0, j =i;
            while(num<=high && j<10){
                num = num*10+(j);
                if(num>=low && num<=high){
                    output.add(num);
                }
                j++;
            }
        }
        Collections.sort(output);
        return output;
    }
}
