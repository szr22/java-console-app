package Test.LC229

import Test.utils.Helper
import com.company.LC229.MajorityElementII

class MajorityElementIITest extends GroovyTestCase {
    void testMajorityElement1() {
        int[] nums = [3,2,3]
        MajorityElementII majorityElementII = new MajorityElementII()
        def actual = majorityElementII.majorityElement(nums)
        def expect = [3]

        Helper.checkArray(actual, expect)
    }

    void testMajorityElement2() {
        int[] nums = [1,1,1,3,3,2,2,2]
        MajorityElementII majorityElementII = new MajorityElementII()
        def actual = majorityElementII.majorityElement(nums)
        def expect = [1,2]

        Helper.checkArray(actual, expect)
    }
}
