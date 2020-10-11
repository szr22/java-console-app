package com.company.LC449;

import com.company.util.TreeNode;

import java.util.HashMap;

public class SerializeAndDeserializeBST {
    StringBuilder sb = new StringBuilder();
    public static HashMap<String, TreeNode> map = new HashMap<>();

    private void inorder(TreeNode root)
    {
        if(root==null) return;
        sb.append(String.valueOf(root.val));
        sb.append(" ");
        inorder(root.left);
        inorder(root.right);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        inorder(root);
        map.put(sb.toString().trim(),root);
        return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return map.get(data);
    }
}
