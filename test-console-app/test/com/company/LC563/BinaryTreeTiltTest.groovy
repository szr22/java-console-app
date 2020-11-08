package com.company.LC563

import Test.utils.Helper
import com.company.util.TreeNode

class BinaryTreeTiltTest extends GroovyTestCase {
    void testFindTilt1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3))
        BinaryTreeTilt binaryTreeTilt = new BinaryTreeTilt()
        int actual = binaryTreeTilt.findTilt(root)
        int expect = 1

        assert actual==expect
    }
}
