package Test.LC389

import com.company.LC389.FindTheDifferenceHashMap

class FindTheDifferenceHashMapTest extends GroovyTestCase {
    void testFindTheDifference() {
        def s = "abcd", t = "abcde"
        FindTheDifferenceHashMap findTheDifferenceHashMap = new FindTheDifferenceHashMap()
        def actual = findTheDifferenceHashMap.findTheDifference(s, t)
        def expect = 'e'

        assert expect==actual
    }
}
