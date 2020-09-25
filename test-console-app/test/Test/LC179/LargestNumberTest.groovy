package Test.LC179

import com.company.LC179.LargestNumber

class LargestNumberTest extends GroovyTestCase {
    void testLargestNumber1() {
        int[] nums = [10,2]
        LargestNumber largestNumber = new LargestNumber()
        def actual = largestNumber.largestNumber(nums)
        def expect = "210"

        assert actual == expect
    }

    void testLargestNumber2() {
        int[] nums = [3,30,34,5,9]
        LargestNumber largestNumber = new LargestNumber()
        def actual = largestNumber.largestNumber(nums)
        def expect = "9534330"

        assert actual == expect
    }
}
