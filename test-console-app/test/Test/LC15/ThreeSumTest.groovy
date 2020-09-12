package Test.LC15

import com.company.LC15.ThreeSum

import static Test.utils.Helper.check2DArray

class ThreeSumTest extends GroovyTestCase {
    void testThreeSum1() {
        ThreeSum threeSum = new ThreeSum()
        int[] nums = [-1,0,1,2,-1,-4]
        def actual = threeSum.threeSum(nums)
        def expect = [[-1,-1,2],[-1,0,1]]

        check2DArray(expect, actual)
    }

    void testThreeSum2() {
        ThreeSum threeSum = new ThreeSum()
        int[] nums = []
        def actual = threeSum.threeSum(nums)
        def expect = []

        check2DArray(expect, actual)
    }

    void testThreeSum3() {
        ThreeSum threeSum = new ThreeSum()
        int[] nums = [0]
        def actual = threeSum.threeSum(nums)
        def expect = []

        check2DArray(expect, actual)
    }
}
