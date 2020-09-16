package Test.LC421

import com.company.LC421.MaximumXorOfTwoNumbersInAnArray

class MaximumXorOfTwoNumbersInAnArrayTest extends GroovyTestCase {
    void testFindMaximumXOR() {
        int[] nums = [3, 10, 5, 25, 2, 8]

        MaximumXorOfTwoNumbersInAnArray maximumXorOfTwoNumbersInAnArray = new MaximumXorOfTwoNumbersInAnArray()
        def actual = maximumXorOfTwoNumbersInAnArray.findMaximumXOR(nums)
        def expect = 28

        assert actual == expect
    }
}
