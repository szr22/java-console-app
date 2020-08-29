package com.company.LC470;

import java.util.Random;

public class ImplementRand10UsingRand7 {
    static int[] mem = new int[10];
    static int max = 0;
    public int rand10() {
        int randNum = rand7();
        if (mem[randNum-1]+1 <= max) {
            max = Math.max(++mem[randNum-1], max);
            return randNum;
        } else {
            int i = 1;
            while(i<=3) {
                if (mem[6+i] < max) {
                    max = Math.max(++mem[6+i], max);
                    return 7+i;
                }
                i++;
            }
        }
        max = Math.max(++mem[randNum-1], max);
        return randNum;
    }

    private int rand7() {
        Random random = new Random();
        return random.ints(1, 7)
                .findFirst()
                .getAsInt();
    }
}
