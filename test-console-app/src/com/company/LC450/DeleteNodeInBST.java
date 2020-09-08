package com.company.LC450;

import com.company.util.TreeNode;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else if (key < root.val){
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left != null && root.right != null){
                int maxVal = findMax(root.left);
                root.val = maxVal;
                root.left = deleteNode(root.left, maxVal);
                return root;
            }else if(root.left != null){
                return root.left;
            }else if(root.right != null){
                return root.right;
            }else{
                return null;
            }
        }
        return root;
    }

    private int findMax(TreeNode root) {
        int max = Integer.MIN_VALUE;
        while(root != null){
            max = root.val;
            root = root.right;
        }
        return max;
    }
}