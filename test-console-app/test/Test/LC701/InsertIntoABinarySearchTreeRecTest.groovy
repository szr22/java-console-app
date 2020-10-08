package Test.LC701

import Test.utils.Helper
import com.company.LC701.InsertIntoABinarySearchTreeRec
import com.company.util.TreeNode

class InsertIntoABinarySearchTreeRecTest extends GroovyTestCase {
    void testInsertIntoBST1() {
        int val = 5
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode right = new TreeNode(7);
        TreeNode root = new TreeNode(4, left, right);
        InsertIntoABinarySearchTreeRec insertIntoABinarySearchTreeRec = new InsertIntoABinarySearchTreeRec()
        TreeNode actual = insertIntoABinarySearchTreeRec.insertIntoBST(root, val)

        TreeNode expectLeft = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode expectRight = new TreeNode(7, new TreeNode(5), null);
        TreeNode expect = new TreeNode(4, expectLeft, expectRight);

        assert Helper.checkTree(actual, expect)
    }
}
