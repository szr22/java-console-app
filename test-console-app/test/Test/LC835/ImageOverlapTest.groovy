package Test.LC835

import com.company.LC835.ImageOverlap
import org.junit.Test

class ImageOverlapTest extends GroovyTestCase {

    @Test
    void testLargestOverlap() {
        def imageOverlap = new ImageOverlap()
        int[][] A = [[1,1,0],
                     [0,1,0],
                     [0,1,0]]
        int[][] B = [[0,0,0],
                     [0,1,1],
                     [0,0,1]]
        def res = imageOverlap.largestOverlap(A, B)

        assert res == 3
    }
}
