package Test.LC450

import com.company.LC450.DeleteNodeInBST
import com.company.util.BinaryTree
import com.company.util.TreeNode
import org.junit.Test

class DeleteNodeInBSTTest extends GroovyTestCase {

    @Test
    void testDeleteNode1() {
        def deleteNodeInBST = new DeleteNodeInBST()
        TreeNode left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode right = new TreeNode(6, null, new TreeNode(7));
        TreeNode root = new TreeNode(5, left, right);
        def key = 3;
        deleteNodeInBST.deleteNode(root, key)

        BinaryTree binaryTree = new BinaryTree(root)
        def actual = binaryTree.levelOrderTreeTraversal()
        def expect = [5, 2, 6, null, 4, null, 7, null, null, null, null]
        assert actual.size() == expect.size()
        for (int i=0; i<actual.size(); i++) {
            assert actual[i] == expect[i]
        }
    }

    void testDeleteNode2() {
        def deleteNodeInBST = new DeleteNodeInBST()
        TreeNode left = new TreeNode(2, null, new TreeNode(4));
        TreeNode right = new TreeNode(6, null, new TreeNode(7));
        TreeNode root = new TreeNode(5, left, right);
        def key = 5;
        deleteNodeInBST.deleteNode(root, key)

        BinaryTree binaryTree = new BinaryTree(root)
        def actual = binaryTree.levelOrderTreeTraversal()
        def expect = [4, 2, 6, null, null, null, 7, null, null]
        assert actual.size() == expect.size()
        for (int i=0; i<actual.size(); i++) {
            assert actual[i] == expect[i]
        }
    }
}
