package Test.LC99

import Test.utils.Helper
import com.company.LC99.RecoverBinarySearchTree
import com.company.util.TreeNode

class RecoverBinarySearchTreeTest extends GroovyTestCase {
    void testRecoverTree1() {
        TreeNode root = new TreeNode(1, new TreeNode(3, null, new TreeNode(2)), null)
        RecoverBinarySearchTree recoverBinarySearchTree = new RecoverBinarySearchTree()
        def actual = recoverBinarySearchTree.recoverTree(root)
        def expect = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), null)

        Helper.checkTree(actual, expect)
    }

    void testRecoverTree2() {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(2), null))
        RecoverBinarySearchTree recoverBinarySearchTree = new RecoverBinarySearchTree()
        def actual = recoverBinarySearchTree.recoverTree(root)
        def expect = new TreeNode(2, new TreeNode(1), new TreeNode(4, new TreeNode(3), null))

        Helper.checkTree(actual, expect)
    }
}
