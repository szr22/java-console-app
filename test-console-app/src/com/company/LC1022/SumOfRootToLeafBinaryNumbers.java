package com.company.LC1022;

import com.company.util.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    int sum = 0;
    public int sumRootToLeaf(TreeNode root){
        if(root==null) return 0;
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int curr) {
        if (node==null) return;
        curr = curr*2 + node.val;
        if(node.left == null && node.right == null){
            sum += curr;
            return;
        }

        dfs(node.left, curr);
        dfs(node.right, curr);
    }
}
