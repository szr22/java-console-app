package Test.LC1

import com.company.LC1.TwoSum

import static Test.utils.Helper.checkArray

class TwoSumTest extends GroovyTestCase {
    void testTwoSum1() {
        TwoSum twoSum = new TwoSum()
        int[] nums = [2,7,11,15]
        int target = 9

        def actual = twoSum.twoSum(nums, target)
        def expect = [0,1]

        checkArray(actual, expect)
    }

    void testTwoSum2() {
        TwoSum twoSum = new TwoSum()
        int[] nums = [3,2,4]
        int target = 6

        def actual = twoSum.twoSum(nums, target)
        def expect = [1,2]

        checkArray(actual, expect)
    }

    void testTwoSum3() {
        TwoSum twoSum = new TwoSum()
        int[] nums = [3,3]
        int target = 6

        def actual = twoSum.twoSum(nums, target)
        def expect = [0,1]

        checkArray(actual, expect)
    }
}
