package Test.LC39

import Test.utils.Helper
import com.company.LC39.CombinationSum

class CombinationSumTest extends GroovyTestCase {
    void testCombinationSum1() {
        int[] candidates = [2,3,6,7]
        int target = 7
        CombinationSum combinationSum = new CombinationSum()
        def actual = combinationSum.combinationSum(candidates, target)
        def expect = [[2,2,3],[7]]

        Helper.check2DArray(actual, expect)
    }

    void testCombinationSum2() {
        int[] candidates = [2,3,5]
        int target = 8
        CombinationSum combinationSum = new CombinationSum()
        def actual = combinationSum.combinationSum(candidates, target)
        def expect = [[2,2,2,2],[2,3,3],[3,5]]

        Helper.check2DArray(actual, expect)
    }

    void testCombinationSum3() {
        int[] candidates = [2]
        int target = 1
        CombinationSum combinationSum = new CombinationSum()
        def actual = combinationSum.combinationSum(candidates, target)
        def expect = []

        Helper.check2DArray(actual, expect)
    }

    void testCombinationSum4() {
        int[] candidates = [1]
        int target = 1
        CombinationSum combinationSum = new CombinationSum()
        def actual = combinationSum.combinationSum(candidates, target)
        def expect = [[1]]

        Helper.check2DArray(actual, expect)
    }

    void testCombinationSum5() {
        int[] candidates = [1]
        int target = 2
        CombinationSum combinationSum = new CombinationSum()
        def actual = combinationSum.combinationSum(candidates, target)
        def expect = [[1,1]]

        Helper.check2DArray(actual, expect)
    }
}
