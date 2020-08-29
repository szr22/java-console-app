package com.company;

public class Main {

    public static void main(String[] args) {
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
}
