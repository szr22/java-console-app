package Test.LC532

import com.company.LC532.KdiffPairsInAnArrayBinary

class KdiffPairsInAnArrayBinaryTest extends GroovyTestCase {
    void testFindPairs1() {
        int[] nums = [3,1,4,1,5]
        int k = 2
        KdiffPairsInAnArrayBinary kdiffPairsInAnArray = new KdiffPairsInAnArrayBinary()
        def actual = kdiffPairsInAnArray.findPairs(nums, k)
        def expect = 2
        assert actual==expect
    }

    void testFindPairs2() {
        int[] nums = [1,2,3,4,5]
        int k = 1
        KdiffPairsInAnArrayBinary kdiffPairsInAnArray = new KdiffPairsInAnArrayBinary()
        def actual = kdiffPairsInAnArray.findPairs(nums, k)
        def expect = 4
        assert actual==expect
    }

    void testFindPairs3() {
        int[] nums = [1,3,1,5,4]
        int k = 0
        KdiffPairsInAnArrayBinary kdiffPairsInAnArray = new KdiffPairsInAnArrayBinary()
        def actual = kdiffPairsInAnArray.findPairs(nums, k)
        def expect = 1
        assert actual==expect
    }

    void testFindPairs4() {
        int[] nums = [1,2,4,4,3,3,0,9,2,3]
        int k = 3
        KdiffPairsInAnArrayBinary kdiffPairsInAnArray = new KdiffPairsInAnArrayBinary()
        def actual = kdiffPairsInAnArray.findPairs(nums, k)
        def expect = 2
        assert actual==expect
    }

    void testFindPairs5() {
        int[] nums = [-1,-2,-3]
        int k = 1
        KdiffPairsInAnArrayBinary kdiffPairsInAnArray = new KdiffPairsInAnArrayBinary()
        def actual = kdiffPairsInAnArray.findPairs(nums, k)
        def expect = 2
        assert actual==expect
    }
}
