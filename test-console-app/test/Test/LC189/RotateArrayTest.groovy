package Test.LC189

import Test.utils.Helper
import com.company.LC189.RotateArray

class RotateArrayTest extends GroovyTestCase {
    void testRotate1() {
        int[] actual = [1,2,3,4,5,6,7]
        def k = 3
        RotateArray rotateArray = new RotateArray()
        rotateArray.rotate(actual, k)
        def expect = [5,6,7,1,2,3,4]
        Helper.checkArray(actual, expect)
    }

    void testRotate2() {
        int[] actual = [-1,-100,3,99]
        def k = 2
        RotateArray rotateArray = new RotateArray()
        rotateArray.rotate(actual, k)
        def expect = [3,99,-1,-100]
        Helper.checkArray(actual, expect)
    }
}
