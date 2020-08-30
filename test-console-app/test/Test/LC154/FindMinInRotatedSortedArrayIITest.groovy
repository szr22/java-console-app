package Test.LC154

import com.company.LC154.FindMinInRotatedSortedArrayII
import org.junit.Test

class FindMinInRotatedSortedArrayIITest extends GroovyTestCase {
    @Test
    void testFindMin1() {
        def findMinInRotatedSortedArrayII = new FindMinInRotatedSortedArrayII()
        int[] nums = [1,3,5]
        def res = findMinInRotatedSortedArrayII.findMin(nums)

        assert res == 1
    }

    @Test
    void testFindMin2() {
        def findMinInRotatedSortedArrayII = new FindMinInRotatedSortedArrayII()
        int[] nums = [2,2,2,0,1]
        def res = findMinInRotatedSortedArrayII.findMin(nums)

        assert res == 0
    }
}
