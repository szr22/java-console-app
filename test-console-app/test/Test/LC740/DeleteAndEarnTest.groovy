package Test.LC740

import com.company.LC740.DeleteAndEarn

class DeleteAndEarnTest extends GroovyTestCase {
    void testDeleteAndEarn1() {
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn()
        int[] nums = [3, 4, 2]
        def actual = deleteAndEarn.deleteAndEarn(nums)
        def expect = 6

        assert actual==expect
    }

    void testDeleteAndEarn2() {
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn()
        int[] nums = [2, 2, 3, 3, 3, 4]
        def actual = deleteAndEarn.deleteAndEarn(nums)
        def expect = 9

        assert actual==expect
    }
}
