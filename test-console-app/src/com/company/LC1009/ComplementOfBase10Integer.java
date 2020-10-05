package com.company.LC1009;

public class ComplementOfBase10Integer {
    private int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n>>1);
    }

    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        return (int)Math.pow(2, countDigits(N)) - 1 - N;
    }
}
