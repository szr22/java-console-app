package Test.LC952

import com.company.LC952.LargestComponentSizeByCommonFactorBetter
import org.junit.Test

class LargestComponentSizeByCommonFactorBetterTest extends GroovyTestCase {
    @Test
    public void testLargestComponentSize1() {
        def largestComponentSizeByCommonFactorBetter = new LargestComponentSizeByCommonFactorBetter()
        int[] A = [2,3,6,7,4,12,21,39]
        def res = largestComponentSizeByCommonFactorBetter.largestComponentSize(A)

        assert res == 8
    }

    @Test
    public void testLargestComponentSize2() {
        def largestComponentSizeByCommonFactorBetter = new LargestComponentSizeByCommonFactorBetter()
        int[] A = [20,50,9,63]
        def res = largestComponentSizeByCommonFactorBetter.largestComponentSize(A)

        assert res == 2
    }
}
