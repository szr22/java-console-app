package Test.LC115

import com.company.LC115.DistinctSubsequences

class DistinctSubsequencesTest extends GroovyTestCase {
    void testNumDistinct1() {
        def S = "rabbbit", T = "rabbit"

        DistinctSubsequences distinctSubsequences = new DistinctSubsequences()
        def actual = distinctSubsequences.numDistinct(S, T)
        def expect = 3

        assert actual==expect
    }

    void testNumDistinct2() {
        def S = "babgbag", T = "bag"

        DistinctSubsequences distinctSubsequences = new DistinctSubsequences()
        def actual = distinctSubsequences.numDistinct(S, T)
        def expect = 5

        assert actual==expect
    }
}
