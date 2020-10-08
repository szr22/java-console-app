package com.company.LC701;

import com.company.util.TreeNode;

public class InsertIntoABinarySearchTreeRec {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode node = new TreeNode();
            node.val = val;
            root = node;
            return root;
        }
        insert(root,val);
        return root;
    }
    private void insert(TreeNode node, int val){
        if(node==null){
            return;
        }
        if(val<node.val){
            if(node.left==null){
                TreeNode nn = new TreeNode();
                nn.val = val;
                node.left=nn;
                return;
            }
            insert(node.left,val);

        }
        else{
            if(node.right==null){
                TreeNode nn = new TreeNode();
                nn.val = val;
                node.right=nn;
                return;
            }
            insert(node.right,val);

        }
    }
}
