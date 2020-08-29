package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslandBFS {
    private int[][] dirs = {{-1,0}, {1, 0}, {0, -1}, {0, 1}};
    public class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
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
                    bfs(i, j, grid);
                }
            }
        return islands;
    }
    public void bfs(int x, int y, char[][] grid){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        grid[x][y] = '0';
        while(!q.isEmpty()){
            Pair curr = q.poll();
            for(int[] d : dirs){
                if(!isUnsafe(curr.x+d[0], curr.y+d[1], grid) && grid[curr.x+d[0]][curr.y+d[1]] == '1'){
                    grid[curr.x+d[0]][curr.y+d[1]] = '0';
                    q.add(new Pair(curr.x+d[0], curr.y+d[1]));
                }
            }
        }
    }
    public boolean isUnsafe(int x, int y, char[][] grid) {
        return (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length);
    }
}
