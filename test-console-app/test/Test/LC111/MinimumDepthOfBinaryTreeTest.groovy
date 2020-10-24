package Test.LC111

import com.company.LC111.MinimumDepthOfBinaryTree
import com.company.util.TreeNode

class MinimumDepthOfBinaryTreeTest extends GroovyTestCase {
    void testMinDepth1() {
        TreeNode left = new TreeNode(9, null, null);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);

        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree()
        def actual = minimumDepthOfBinaryTree.minDepth(root)
        def expect = 2

        assert actual==expect
    }

    void testMinDepth2() {
        TreeNode right = new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6))));
        TreeNode root = new TreeNode(2, null, right);

        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree()
        def actual = minimumDepthOfBinaryTree.minDepth(root)
        def expect = 5

        assert actual==expect
    }
}
