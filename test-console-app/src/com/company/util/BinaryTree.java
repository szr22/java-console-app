package com.company.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(TreeNode node){
        this.root = node;
    }

    public List<Integer> levelOrderTreeTraversal()
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> res = new ArrayList();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode==null){
                res.add(null);
                continue;
            }
            res.add(tempNode.val);

            /*Enqueue left child */
//            if (tempNode.left != null) {
//                queue.add(tempNode.left);
//            }
            queue.add(tempNode.left);

            /*Enqueue right child */
//            if (tempNode.right != null) {
//                queue.add(tempNode.right);
//            }
            queue.add(tempNode.right);
        }

        return res;
    }
}
