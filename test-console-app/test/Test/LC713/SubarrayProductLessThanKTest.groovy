package Test.LC713

import com.company.LC713.SubarrayProductLessThanK

class SubarrayProductLessThanKTest extends GroovyTestCase {
    void testNumSubarrayProductLessThanK() {
        int[] nums = [10, 5, 2, 6]
        int k = 100
        SubarrayProductLessThanK subarrayProductLessThanK = new SubarrayProductLessThanK()
        def actual = subarrayProductLessThanK.numSubarrayProductLessThanK(nums, k)
        def expect = 8

        assert actual==expect
    }
}
