package Test.LC41

import com.company.LC41.FirstMissingPositive

class FirstMissingPositiveTest extends GroovyTestCase {
    void testFirstMissingPositive1() {
        int[] nums = [1,2,0]
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive()
        def actual = firstMissingPositive.firstMissingPositive(nums)
        def expect = 3

        assert actual == expect
    }

    void testFirstMissingPositive2() {
        int[] nums = [3,4,-1,1]
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive()
        def actual = firstMissingPositive.firstMissingPositive(nums)
        def expect = 2

        assert actual == expect
    }

    void testFirstMissingPositive3() {
        int[] nums = [7,8,9,11,12]
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive()
        def actual = firstMissingPositive.firstMissingPositive(nums)
        def expect = 1

        assert actual == expect
    }
}
