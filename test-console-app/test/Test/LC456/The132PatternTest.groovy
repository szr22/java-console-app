package Test.LC456

import com.company.LC456.The132Pattern

class The132PatternTest extends GroovyTestCase {
    void testFind132pattern1() {
        int[] nums = [1,2,3,4]
        The132Pattern the132Pattern = new The132Pattern()
        def actual = the132Pattern.find132pattern(nums)
        def expect = false

        assert actual == expect
    }

    void testFind132pattern2() {
        int[] nums = [3,1,4,2]
        The132Pattern the132Pattern = new The132Pattern()
        def actual = the132Pattern.find132pattern(nums)
        def expect = true

        assert actual == expect
    }

    void testFind132pattern3() {
        int[] nums = [-1,3,2,0]
        The132Pattern the132Pattern = new The132Pattern()
        def actual = the132Pattern.find132pattern(nums)
        def expect = true

        assert actual == expect
    }
}
