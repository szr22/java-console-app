package com.company.LC111;

import com.company.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root){
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.remove();
                if(node.left==null && node.right==null)
                    return depth;
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
        }
        return depth;
    }
}
