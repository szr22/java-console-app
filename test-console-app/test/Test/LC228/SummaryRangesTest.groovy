package Test.LC228

import Test.utils.Helper
import com.company.LC228.SummaryRanges

class SummaryRangesTest extends GroovyTestCase {
    void testSummaryRanges1() {
        int[] nums = [0,1,2,4,5,7]
        SummaryRanges summaryRanges = new SummaryRanges()
        def actual = summaryRanges.summaryRanges(nums)
        def expect = ["0->2","4->5","7"]
        Helper.checkArray(actual, expect)
    }

    void testSummaryRanges2() {
        int[] nums = [0,2,3,4,6,8,9]
        SummaryRanges summaryRanges = new SummaryRanges()
        def actual = summaryRanges.summaryRanges(nums)
        def expect = ["0","2->4","6","8->9"]
        Helper.checkArray(actual, expect)
    }

    void testSummaryRanges3() {
        int[] nums = []
        SummaryRanges summaryRanges = new SummaryRanges()
        def actual = summaryRanges.summaryRanges(nums)
        def expect = []
        Helper.checkArray(actual, expect)
    }

    void testSummaryRanges4() {
        int[] nums = [-1]
        SummaryRanges summaryRanges = new SummaryRanges()
        def actual = summaryRanges.summaryRanges(nums)
        def expect = ["-1"]
        Helper.checkArray(actual, expect)
    }

    void testSummaryRanges5() {
        int[] nums =[0]
        SummaryRanges summaryRanges = new SummaryRanges()
        def actual = summaryRanges.summaryRanges(nums)
        def expect = ["0"]
        Helper.checkArray(actual, expect)
    }
}
