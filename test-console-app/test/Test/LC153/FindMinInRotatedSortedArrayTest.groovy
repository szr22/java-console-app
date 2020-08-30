package Test.LC153

import com.company.LC153.FindMinInRotatedSortedArray
import org.junit.Test

class FindMinInRotatedSortedArrayTest extends GroovyTestCase {
    @Test
    void testFindMin1() {
        def findMinInRotatedSortedArray = new FindMinInRotatedSortedArray()
        int[] nums = [3,4,5,1,2]
        def res = findMinInRotatedSortedArray.findMin(nums)

        assert res == 1
    }

    @Test
    void testFindMin2() {
        def findMinInRotatedSortedArray = new FindMinInRotatedSortedArray()
        int[] nums = [4,5,6,7,0,1,2]
        def res = findMinInRotatedSortedArray.findMin(nums)

        assert res == 0
    }
}
