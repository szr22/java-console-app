package Test.LC213

import com.company.LC213.HouseRobberII

class HouseRobberIITest extends GroovyTestCase {
    void testRob1() {
        HouseRobberII houseRobberII = new HouseRobberII()
        int[] nums = [2,3,2]
        def actual = houseRobberII.rob(nums)
        def expect = 3

        assert actual==expect
    }

    void testRob2() {
        HouseRobberII houseRobberII = new HouseRobberII()
        int[] nums = [1,2,3,1]
        def actual = houseRobberII.rob(nums)
        def expect = 4

        assert actual==expect
    }
}
