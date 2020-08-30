package Test.LC952

import com.company.LC952.LargestComponentSizeByCommonFactorUnionFindClass
import org.junit.Test

class LargestComponentSizeByCommonFactorUnionFindClassTest extends GroovyTestCase {
    @Test
    public void testLargestComponentSize1() {
        def largestComponentSizeByCommonFactorUnionFindClass = new LargestComponentSizeByCommonFactorUnionFindClass()
        int[] A = [2,3,6,7,4,12,21,39]
        def res = largestComponentSizeByCommonFactorUnionFindClass.largestComponentSize(A)

        assert res == 8
    }

    @Test
    public void testLargestComponentSize2() {
        def largestComponentSizeByCommonFactorUnionFindClass = new LargestComponentSizeByCommonFactorUnionFindClass()
        int[] A = [20,50,9,63]
        def res = largestComponentSizeByCommonFactorUnionFindClass.largestComponentSize(A)

        assert res == 2
    }
}
