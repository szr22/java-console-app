package Test.LC673

import com.company.LC673.NumberOfLongestIncreasingSubsequence

class NumberOfLongestIncreasingSubsequenceTest extends GroovyTestCase {
    void testFindNumberOfLIS1() {
        int[] nums = [1,3,5,4,7]
        NumberOfLongestIncreasingSubsequence numberOfLongestIncreasingSubsequence = new NumberOfLongestIncreasingSubsequence()
        def actual = numberOfLongestIncreasingSubsequence.findNumberOfLIS(nums)
        def expect = 2
        assert actual == expect
    }

    void testFindNumberOfLIS2() {
        int[] nums = [2,2,2,2,2]
        NumberOfLongestIncreasingSubsequence numberOfLongestIncreasingSubsequence = new NumberOfLongestIncreasingSubsequence()
        def actual = numberOfLongestIncreasingSubsequence.findNumberOfLIS(nums)
        def expect = 5
        assert actual == expect
    }
}
