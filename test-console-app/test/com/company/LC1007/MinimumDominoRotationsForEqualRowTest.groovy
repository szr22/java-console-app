package Test.LC1007

import com.company.LC1007.MinimumDominoRotationsForEqualRow

class MinimumDominoRotationsForEqualRowTest extends GroovyTestCase {
    void testMinDominoRotations1() {
        int[] A = [2,1,2,4,2,2]
        int[] B = [5,2,6,2,3,2]
        MinimumDominoRotationsForEqualRow minimumDominoRotationsForEqualRow = new MinimumDominoRotationsForEqualRow();
        def actual = minimumDominoRotationsForEqualRow.minDominoRotations(A, B)
        def expect = 2

        assert actual == expect
    }

    void testMinDominoRotations2() {
        int[] A = [3,5,1,2,3]
        int[] B = [3,6,3,3,4]
        MinimumDominoRotationsForEqualRow minimumDominoRotationsForEqualRow = new MinimumDominoRotationsForEqualRow();
        def actual = minimumDominoRotationsForEqualRow.minDominoRotations(A, B)
        def expect = -1

        assert actual == expect
    }
}
