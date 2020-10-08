package Test.LC704

import com.company.LC704.BinarySearch

class BinarySearchTest extends GroovyTestCase {
    void testSearch1() {
        int[] nums = [-1,0,3,5,9,12]
        int target = 9
        BinarySearch binarySearch = new BinarySearch()
        def actual = binarySearch.search(nums, target)
        def expect = 4

        assert  actual == expect
    }

    void testSearch2() {
        int[] nums = [-1,0,3,5,9,12]
        int target = 2
        BinarySearch binarySearch = new BinarySearch()
        def actual = binarySearch.search(nums, target)
        def expect = -1

        assert  actual == expect
    }
}
