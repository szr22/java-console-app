package Test.LC16

import com.company.LC16.ThreeSumClosest

import static Test.utils.Helper.check2DArray

class ThreeSumClosestTest extends GroovyTestCase {

    void testThreeSumClosest1() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest()
        int[] nums = [-1,2,1,-4]
        int target = 1
        def actual = threeSumClosest.threeSumClosest(nums, target)
        def expect = 2

        assert actual==expect
    }

    void testThreeSumClosest2() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest()
        int[] nums = [-1,2,1,-4]
        int target = 1
        def actual = threeSumClosest.threeSumClosestBinary(nums, target)
        def expect = 2

        assert actual==expect
    }
}
