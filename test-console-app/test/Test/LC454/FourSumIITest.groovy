package Test.LC454

import com.company.LC454.FourSumII

class FourSumIITest extends GroovyTestCase {
    void testFourSumCount() {
        FourSumII fourSumII = new FourSumII();
        int[] A = [ 1, 2]
        int[] B = [-2,-1]
        int[] C = [-1, 2]
        int[] D = [ 0, 2]
        def actual = fourSumII.fourSumCount(A, B, C, D)
        def expect = 2
        assert actual == expect
    }
}
