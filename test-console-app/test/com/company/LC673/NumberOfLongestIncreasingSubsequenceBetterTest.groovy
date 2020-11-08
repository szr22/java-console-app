package com.company.LC673

class NumberOfLongestIncreasingSubsequenceBetterTest extends GroovyTestCase {
    void testFindNumberOfLIS1() {
        int[] nums = [1,3,5,4,7]
        NumberOfLongestIncreasingSubsequenceBetter numberOfLongestIncreasingSubsequenceBetter = new NumberOfLongestIncreasingSubsequenceBetter()
        def actual = numberOfLongestIncreasingSubsequenceBetter.findNumberOfLIS(nums)
        def expect = 2
        assert actual == expect
    }

    void testFindNumberOfLIS2() {
        int[] nums = [2,2,2,2,2]
        NumberOfLongestIncreasingSubsequenceBetter numberOfLongestIncreasingSubsequenceBetter = new NumberOfLongestIncreasingSubsequenceBetter()
        def actual = numberOfLongestIncreasingSubsequenceBetter.findNumberOfLIS(nums)
        def expect = 5
        assert actual == expect
    }
}
