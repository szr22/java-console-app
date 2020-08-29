package com.company;

import com.company.LC470.ImplementRand10UsingRand7;

public class Main {

    public static void main(String[] args) {
        testImplementRand10UsingRand7();

//        testNumberOfIsland();

    }

    private static void testNumberOfIsland() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        grid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
//        NumberOfIslandUnionFind numberOfIslandUnionFind = new NumberOfIslandUnionFind();
//        int numberOfIsland = numberOfIslandUnionFind.numIslands(grid);

        NumberOfIslandBFS numberOfIslandBFS = new NumberOfIslandBFS();
        int numberOfIsland = numberOfIslandBFS.numIslands(grid);

        System.out.println(numberOfIsland);
    }

    private static void testImplementRand10UsingRand7() {
        ImplementRand10UsingRand7 rand10 = new ImplementRand10UsingRand7();
        int randNum;
        for (int i=0; i<10; i++) {
            randNum = rand10.rand10();
            System.out.println(randNum);
        }
    }
}
