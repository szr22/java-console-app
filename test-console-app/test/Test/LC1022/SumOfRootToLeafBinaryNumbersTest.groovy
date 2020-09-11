package Test.LC1022

import com.company.LC1022.SumOfRootToLeafBinaryNumbers
import com.company.util.TreeNode
import org.junit.Test

class SumOfRootToLeafBinaryNumbersTest extends GroovyTestCase {

    @Test
    void testSumRootToLeaf() {
        def sumOfRootToLeafBinaryNumbers = new SumOfRootToLeafBinaryNumbers()
        TreeNode left = new TreeNode(0, new TreeNode(0), new TreeNode(1));
        TreeNode right = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        TreeNode root = new TreeNode(1, left, right);

        def actual = sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root)
        def expect = 22
        assert actual == expect

    }
}
