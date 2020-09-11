package Test.LC152

import com.company.LC152.MaximumProductSubarray
import org.junit.Test

class MaximumProductSubarrayTest extends GroovyTestCase {

    @Test
    void testMaxProduct1() {
        MaximumProductSubarray MaximumProductSubarray = new MaximumProductSubarray();
        int[] nums = [2,3,-2,4]
        def actual = MaximumProductSubarray.maxProduct(nums)
        def expect = 6
        assert expect == actual
    }

    @Test
    void testMaxProduct2() {
        MaximumProductSubarray MaximumProductSubarray = new MaximumProductSubarray();
        int[] nums = [-2,0,-1]
        def actual = MaximumProductSubarray.maxProduct(nums)
        def expect = 0
        assert expect == actual
    }
}
