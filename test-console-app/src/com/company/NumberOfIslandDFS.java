package com.company;

public class NumberOfIslandDFS {
    int[][] dirs = {{-1,0}, {1, 0}, {0, -1}, {0, 1}};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0 || grid == null)
            return 0;
        int n = grid[0].length;
        int islands = 0;
        for(int i = 0; i<m; i++)
            for(int j = 0; j<n; j++){
                if(grid[i][j] == '1'){
                    islands++;
                    dfs(i, j, grid);
                }
            }
        return islands;
    }

    public void dfs(int x, int y, char[][] grid){
        if(isUnsafe(x, y, grid) || grid[x][y] == '0')
            return;
        grid[x][y] = '0';
        for(int[] d : dirs){
            if(!isUnsafe(x+d[0], y+d[1], grid) && grid[x+d[0]][y+d[1]] == '1'){
                dfs(x+d[0], y+d[1], grid);
            }
        }
    }
    public boolean isUnsafe(int x, int y, char[][] grid) {
        return (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length);
    }
}
