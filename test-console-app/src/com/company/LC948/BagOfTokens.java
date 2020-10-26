package com.company.LC948;

import java.util.Arrays;

public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int count = 0;
        int score = 0;
        for (int left=0, right=tokens.length-1; left <= right ; ) {
            if (P>=tokens[left]) {
                score++;
                P -= tokens[left++];
                count = Math.max(score, count);
                continue;
            }
            if (score>0) {
                score--;
                P += tokens[right--];
            } else {
                break;
            }
        }
        return count;
    }
}
