package Test.LC57

import com.company.LC57.InsertInterval

import static Test.utils.Helper.check2DArray

class InsertIntervalTest extends GroovyTestCase {
    void testInsert1() {
        InsertInterval insertInterval = new InsertInterval()
        int[][] intervals = [[1,3],[6,9]]
        int[] newInterval = [2,5]

        def actual = insertInterval.insert(intervals, newInterval)
        def expect = [[1,5],[6,9]]

        check2DArray(expect, actual)
    }

    void testInsert2() {
        InsertInterval insertInterval = new InsertInterval()
        int[][] intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]]
        int[] newInterval = [4,8]

        def actual = insertInterval.insert(intervals, newInterval)
        def expect = [[1,2],[3,10],[12,16]]

        check2DArray(expect, actual)
    }
}
