package Test.LC63

import com.company.LC63.UniquePathsII

class UniquePathsIITest extends GroovyTestCase {
    void testUniquePathsWithObstacles() {
        int[][] obstacleGrid = [
                [0,0,0],
                [0,1,0],
                [0,0,0]
        ]
        UniquePathsII uniquePathsII = new UniquePathsII()
        def actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid)
        def expect = 2

        assert actual==expect
    }
}
