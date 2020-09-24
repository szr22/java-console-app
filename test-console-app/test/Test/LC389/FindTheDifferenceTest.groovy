package Test.LC389

import com.company.LC389.FindTheDifference

class FindTheDifferenceTest extends GroovyTestCase {
    void testFindTheDifference() {
        def s = "abcd", t = "abcde"
        FindTheDifference findTheDifference = new FindTheDifference()
        def actual = findTheDifference.findTheDifference(s, t)
        def expect = 'e'

        assert expect==actual
    }
}
