package Test.LC310

import Test.utils.Helper
import com.company.LC310.MinimumHeightTrees

class MinimumHeightTreesTest extends GroovyTestCase {
    void testFindMinHeightTrees1() {
        int n = 4
        int[][] edges = [[1,0],[1,2],[1,3]]
        MinimumHeightTrees minimumHeightTrees = new MinimumHeightTrees()
        def actual = minimumHeightTrees.findMinHeightTrees(n, edges)
        def expect = [1]
        Helper.checkArray(actual, expect)
    }

    void testFindMinHeightTrees2() {
        int n = 6
        int[][] edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
        MinimumHeightTrees minimumHeightTrees = new MinimumHeightTrees()
        def actual = minimumHeightTrees.findMinHeightTrees(n, edges)
        def expect = [3, 4]
        Helper.checkArray(actual, expect)
    }

    void testFindMinHeightTrees3() {
        int n = 1
        int[][] edges = []
        MinimumHeightTrees minimumHeightTrees = new MinimumHeightTrees()
        def actual = minimumHeightTrees.findMinHeightTrees(n, edges)
        def expect = [0]
        Helper.checkArray(actual, expect)
    }

    void testFindMinHeightTrees4() {
        int n = 2
        int[][] edges = [[0,1]]
        MinimumHeightTrees minimumHeightTrees = new MinimumHeightTrees()
        def actual = minimumHeightTrees.findMinHeightTrees(n, edges)
        def expect = [0,1]
        Helper.checkArray(actual, expect)
    }
}
