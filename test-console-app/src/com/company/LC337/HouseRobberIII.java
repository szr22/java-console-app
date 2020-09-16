package com.company.LC337;

import com.company.util.TreeNode;

public class HouseRobberIII {
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }

    private int[] helper(TreeNode root) {
        if(root==null){
            return new int[]{0,0};
        }
        int res1[] = helper(root.left);
        int res2[] = helper(root.right);
        int res[] = new int[2];
        res[0] = Math.max(res1[0], res1[1]) + Math.max(res2[0], res2[1]);
        res[1] = res1[0]+res2[0]+root.val;
        return res;
    }
}
