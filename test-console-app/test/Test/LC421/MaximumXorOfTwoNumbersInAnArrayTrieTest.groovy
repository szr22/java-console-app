package Test.LC421

import com.company.LC421.MaximumXorOfTwoNumbersInAnArrayTrie

class MaximumXorOfTwoNumbersInAnArrayTrieTest extends GroovyTestCase {
    void testFindMaximumXOR() {
        int[] nums = [3, 10, 5, 25, 2, 8]

        MaximumXorOfTwoNumbersInAnArrayTrie maximumXorOfTwoNumbersInAnArray = new MaximumXorOfTwoNumbersInAnArrayTrie()
        def actual = maximumXorOfTwoNumbersInAnArray.findMaximumXOR(nums)
        def expect = 28

        assert actual == expect
    }
}
