package com.company.LC701;

import com.company.util.TreeNode;

public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        TreeNode currNode = root, prevNode = null;
        while (currNode != null) {
            prevNode = currNode;
            if (val > currNode.val) {
                currNode = currNode.right;
                continue;
            }

            if (val <= currNode.val) {
                currNode = currNode.left;
                continue;
            }
        }

        if (val > prevNode.val) {
            prevNode.right = new TreeNode(val);
        } else if (val <= prevNode.val) {
            prevNode.left = new TreeNode(val);
        }

        return root;
    }
}
