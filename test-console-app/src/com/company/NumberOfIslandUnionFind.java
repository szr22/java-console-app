package com.company;

public class NumberOfIslandUnionFind {
    private class Node {
        public int parent;
        public int size;

        public Node (int i) {
            this.parent = i;
            this.size = 1;
        }

        public void merge (Node node) {
            if(this.size<node.size) {
                this.parent = node.parent;
            }
            else {
                node.parent = this.parent;
                if(node.size == this.size) {
                    node.size++;
                }
            }
        }
    }

    private class UnionFind {
        private Node[] nodes;
        private int height;
        public UnionFind(int size)
        {
            this.nodes = new Node[size];
            for (int i = 0; i < size; i++) {
                this.nodes[i] = new Node(i);
            }
        }

        public Node find(int x){
            Node xNode = this.nodes[x];
            while(xNode.parent !=x )
            {
                x = xNode.parent;
                xNode = this.nodes[x];
            }
            return xNode;
        }

        public boolean join(int x, int y){
            Node a = find(x);
            Node b = find(y);

            if(a.parent==b.parent) return false;

            a.merge(b);

            return true;
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;

        Index index = new Index(grid);

        UnionFind uf = new UnionFind(index.getSize());

        for(int i=0; i<index.getWidth();i++)
            for(int j=0;j<index.getHeight();j++)
            {
                if(grid[i][j] == '1')
                {
                    count++;
                    int ijValue = index.getValue(i,j);

                    if(i>0 && grid[i-1][j] == '1')
                    {
                        int topNeighbor = index.getValue(i-1,j);
                        if(uf.join(ijValue,topNeighbor)) count--;
                    };
                    if(j>0 && grid[i][j-1] == '1')
                    {
                        int leftNeighbor = index.getValue(i,j-1);
                        if(uf.join(ijValue,leftNeighbor)) count--;
                    }
                }
            }

        return count;
    }

    private class Index {
        private int width;
        private int height;

        public Index(char[][] grid){
            this.width = grid.length;
            this.height = grid[0].length;
        }
        public int getWidth() { return this.width;}
        public int getHeight() { return this.height;}
        public int getSize() { return this.width*this.height;}
        public int getValue(int i, int j)
        {
            return i*this.height+j;
        }
    }
}