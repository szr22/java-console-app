package Test.LC337

import com.company.LC337.HouseRobberIII
import com.company.util.TreeNode

class HouseRobberIIITest extends GroovyTestCase {
    void testRob1() {
        HouseRobberIII houseRobberIII = new HouseRobberIII()

        TreeNode left = new TreeNode(2, null, new TreeNode(3));
        TreeNode right = new TreeNode(3, null, new TreeNode(1));
        TreeNode root = new TreeNode(3, left, right);

        def actual = houseRobberIII.rob(root)
        def expect = 7

        assert actual==expect
    }

    void testRob2() {
        HouseRobberIII houseRobberIII = new HouseRobberIII()

        TreeNode left = new TreeNode(4, new TreeNode(1), new TreeNode(3));
        TreeNode right = new TreeNode(5, null, new TreeNode(1));
        TreeNode root = new TreeNode(3, left, right);

        def actual = houseRobberIII.rob(root)
        def expect = 9

        assert actual==expect
    }
}
