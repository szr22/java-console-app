package Test.LC449

import com.company.LC449.SerializeAndDeserializeBST
import com.company.util.TreeNode

class SerializeAndDeserializeBSTTest extends GroovyTestCase {
    void testSerializeAndDeserializeBSTTest() {
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode right = new TreeNode(7);
        TreeNode root = new TreeNode(4, left, right);

        SerializeAndDeserializeBST serializeAndDeserializeBST = new SerializeAndDeserializeBST()
        def actual = serializeAndDeserializeBST.serialize(root)
        def expect = "4 2 1 3 7"

        assert actual == expect
    }
}
