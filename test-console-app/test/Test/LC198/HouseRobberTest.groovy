package Test.LC198

import com.company.LC198.HouseRobber

class HouseRobberTest extends GroovyTestCase {

    void testRob1() {
        HouseRobber houseRobber = new HouseRobber()
        int[] nums = [1,2,3,1]
        def actual = houseRobber.rob(nums)
        def expect = 4

        assert actual==expect
    }

    void testRob2() {
        HouseRobber houseRobber = new HouseRobber()
        int[] nums = [2,7,9,3,1]
        def actual = houseRobber.rob(nums)
        def expect = 12

        assert actual==expect
    }
}
