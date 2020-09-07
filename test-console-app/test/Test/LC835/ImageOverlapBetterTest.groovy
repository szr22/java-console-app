package Test.LC835

import com.company.LC835.ImageOverlapBetter
import org.junit.Test

class ImageOverlapBetterTest extends GroovyTestCase {
    @Test
    void testLargestOverlap() {
        def imageOverlapBetter = new ImageOverlapBetter()
        int[][] A = [[1,1,0],
             [0,1,0],
             [0,1,0]]
        int[][] B = [[0,0,0],
             [0,1,1],
             [0,0,1]]
        def res = imageOverlapBetter.largestOverlap(A, B)

        assert res == 3
    }
}
