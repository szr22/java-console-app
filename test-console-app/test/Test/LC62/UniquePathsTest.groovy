package Test.LC62

import com.company.LC62.UniquePaths

class UniquePathsTest extends GroovyTestCase {
    void testUniquePaths1() {
        def m = 3, n = 2
        UniquePaths uniquePaths = new UniquePaths()
        def actual = uniquePaths.uniquePaths(m, n)
        def expect = 3

        assert actual==expect
    }

    void testUniquePaths2() {
        def m = 7, n = 3
        UniquePaths uniquePaths = new UniquePaths()
        def actual = uniquePaths.uniquePaths(m, n)
        def expect = 28

        assert actual==expect
    }

    void testUniquePaths3() {
        def m = 3, n = 3
        UniquePaths uniquePaths = new UniquePaths()
        def actual = uniquePaths.uniquePaths(m, n)
        def expect = 6

        assert actual==expect
    }
}
