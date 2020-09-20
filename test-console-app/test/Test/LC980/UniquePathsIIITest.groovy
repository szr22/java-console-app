package Test.LC980

import com.company.LC980.UniquePathsIII

class UniquePathsIIITest extends GroovyTestCase {
    void testUniquePathsIII1() {
        int[][] grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
        UniquePathsIII uniquePathsIII = new UniquePathsIII()
        def actual = uniquePathsIII.uniquePathsIII(grid)
        def expect = 2

        assert  actual==expect
    }

    void testUniquePathsIII2() {
        int[][] grid = [[1,0,0,0],[0,0,0,0],[0,0,0,2]]
        UniquePathsIII uniquePathsIII = new UniquePathsIII()
        def actual = uniquePathsIII.uniquePathsIII(grid)
        def expect = 4

        assert  actual==expect
    }

    void testUniquePathsIII3() {
        int[][] grid = [[0,1],[2,0]]
        UniquePathsIII uniquePathsIII = new UniquePathsIII()
        def actual = uniquePathsIII.uniquePathsIII(grid)
        def expect = 0

        assert  actual==expect
    }
}
