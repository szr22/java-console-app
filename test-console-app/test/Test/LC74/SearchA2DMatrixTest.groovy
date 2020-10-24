package Test.LC74

import com.company.LC74.SearchA2DMatrix

class SearchA2DMatrixTest extends GroovyTestCase {
    void testSearchMatrix1() {
        int[][] matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]]
        int target = 3
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix()
        def actual = searchA2DMatrix.searchMatrix(matrix, target)
        def expect = true

        assert actual == expect
    }

    void testSearchMatrix2() {
        int[][] matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]]
        int target = 13
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix()
        def actual = searchA2DMatrix.searchMatrix(matrix, target)
        def expect = false

        assert actual == expect
    }

    void testSearchMatrix3() {
        int[][] matrix = []
        int target = 0
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix()
        def actual = searchA2DMatrix.searchMatrix(matrix, target)
        def expect = false

        assert actual == expect
    }
}
