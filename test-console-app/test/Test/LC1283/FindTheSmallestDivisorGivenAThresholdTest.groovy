package Test.LC1283

import com.company.LC1283.FindTheSmallestDivisorGivenAThreshold

class FindTheSmallestDivisorGivenAThresholdTest extends GroovyTestCase {
    void testSmallestDivisor1() {
        int[] nums = [1,2,5,9]
        int threshold = 6

        FindTheSmallestDivisorGivenAThreshold findTheSmallestDivisorGivenAThreshold = new FindTheSmallestDivisorGivenAThreshold()
        def actual = findTheSmallestDivisorGivenAThreshold.smallestDivisor(nums, threshold)
        def expect = 5

        assert actual == expect
    }

    void testSmallestDivisor2() {
        int[] nums = [2,3,5,7,11]
        int threshold = 11

        FindTheSmallestDivisorGivenAThreshold findTheSmallestDivisorGivenAThreshold = new FindTheSmallestDivisorGivenAThreshold()
        def actual = findTheSmallestDivisorGivenAThreshold.smallestDivisor(nums, threshold)
        def expect = 3

        assert actual == expect
    }

    void testSmallestDivisor3() {
        int[] nums = [19]
        int threshold = 5

        FindTheSmallestDivisorGivenAThreshold findTheSmallestDivisorGivenAThreshold = new FindTheSmallestDivisorGivenAThreshold()
        def actual = findTheSmallestDivisorGivenAThreshold.smallestDivisor(nums, threshold)
        def expect = 4

        assert actual == expect
    }
}
