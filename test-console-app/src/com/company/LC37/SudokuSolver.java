package com.company.LC37;

public class SudokuSolver {
    int[] rows = new int[9];
    int[] cols = new int[9];
    int[] square = new int[9];
    public void solveSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int val = board[i][j] - '0';
                setBit(i, j, val);
            }
        }
        backtrack(0, 0, board);
    }

    private boolean backtrack(int i, int j, char[][] board) {
        int nextRow = i, nextCol = j + 1;
        if(j == 8) {
            nextRow = i + 1;
            nextCol = 0;
        }

        if (board[i][j] != '.') {
            if (i == 8 && j == 8) return true;
            return backtrack(nextRow, nextCol, board);
        }

        for (int k = 1; k <= 9; k++) {
            char ch = (char)(k + 48);
            if(checkBit(i, j ,k)) continue;
            setBit(i, j, k);
            board[i][j] = ch;
            if (i == 8 && j == 8) return true;
            if (backtrack(nextRow, nextCol, board)) return true;
            clearBit(i, j, k);
            board[i][j] = '.';
        }
        return false;
    }

    private boolean checkBit(int i, int j, int val) {
        int mask = (1 << val);
        return ((rows[i] & mask) == mask) || ((cols[j] & mask) == mask) || ((square[getBlock(i,j)] & mask) == mask);
    }

    private void setBit(int i, int j, int val) {
        int mask = (1 << val);
        rows[i] |= mask;
        cols[j] |= mask;
        square[getBlock(i,j)] |= mask;
    }

    private void clearBit(int i, int j, int val) {
        int mask = ~(1 << val);
        rows[i] &= mask;
        cols[j] &= mask;
        square[getBlock(i,j)] &= mask;
    }

    private int getBlock(int i, int j) {
        if(i<=2 && j<=2) return 0;
        if(j>=3 && j<=5 && i<=2) return 1;
        if(j>=6 && i<=2) return 2;

        if(i>=3 && i<=5 && j<=2) return 3;
        if(i>=3 && i<=5 && j>=3 && j<=5) return 4;
        if(i>=3 && i<=5 && j>=6) return 5;

        if(i>=6 && j<=2) return 6;
        if(i>=6 && j>=3 && j<=5) return 7;
        if(i>=6 && j>=6) return 8;
        return -1;
    }
}
