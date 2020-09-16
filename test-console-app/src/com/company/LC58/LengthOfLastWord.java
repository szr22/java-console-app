package com.company.LC58;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] charArr = s.toCharArray();
        int res = 0;
        boolean flag = false;

        for(int i=charArr.length-1; i>=0; i--){
            char ch = charArr[i];
            if(Character.isAlphabetic(ch)){
                flag = true;
                res++;
            }else{
                if(flag)
                    return res;
            }
        }
        return res;
    }
}
