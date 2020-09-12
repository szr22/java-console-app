package Test.LC216

import com.company.LC216.CombinationSumIII

import static Test.utils.Helper.check2DArray

class CombinationSumIIITest extends GroovyTestCase {
    void testCombinationSum31() {
        CombinationSumIII combinationSumIII = new CombinationSumIII();
        def actual = combinationSumIII.combinationSum3(3, 7);
        def expect = [[1,2,4]];

        check2DArray(expect, actual)
    }

    void testCombinationSum32() {
        CombinationSumIII combinationSumIII = new CombinationSumIII();
        def actual = combinationSumIII.combinationSum3(3, 9)
        def expect = [[1,2,6], [1,3,5], [2,3,4]]

        check2DArray(expect, actual)
    }
}
