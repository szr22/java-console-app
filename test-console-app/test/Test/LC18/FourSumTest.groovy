package Test.LC18

import com.company.LC18.FourSum

import static Test.utils.Helper.check2DArray

class FourSumTest extends GroovyTestCase {

    void testFourSum1() {
        FourSum fourSum = new FourSum()
        int[] nums = [1, 0, -1, 0, -2, 2]
        int target = 0
        def actual = fourSum.fourSum(nums, target)
        def expect = [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

        check2DArray(expect, actual)
    }
}
