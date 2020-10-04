package Test.LC1288

import com.company.LC1288.RemoveCoveredIntervalsSort

class RemoveCoveredIntervalsSortTest extends GroovyTestCase {
    void testRemoveCoveredIntervals1() {
        int[][] intervals = [[1,4],[3,6],[2,8]]
        RemoveCoveredIntervalsSort removeCoveredIntervalsSort = new RemoveCoveredIntervalsSort()
        def actual = removeCoveredIntervalsSort.removeCoveredIntervals(intervals)
        def expect = 2

        assert actual == expect
    }

    void testRemoveCoveredIntervals2() {
        int[][] intervals = [[1,4],[2,3]]
        RemoveCoveredIntervalsSort removeCoveredIntervalsSort = new RemoveCoveredIntervalsSort()
        def actual = removeCoveredIntervalsSort.removeCoveredIntervals(intervals)
        def expect = 1

        assert actual == expect
    }

    void testRemoveCoveredIntervals3() {
        int[][] intervals = [[0,10],[5,12]]
        RemoveCoveredIntervalsSort removeCoveredIntervalsSort = new RemoveCoveredIntervalsSort()
        def actual = removeCoveredIntervalsSort.removeCoveredIntervals(intervals)
        def expect = 2

        assert actual == expect
    }

    void testRemoveCoveredIntervals4() {
        int[][] intervals = [[3,10],[4,10],[5,11]]
        RemoveCoveredIntervalsSort removeCoveredIntervalsSort = new RemoveCoveredIntervalsSort()
        def actual = removeCoveredIntervalsSort.removeCoveredIntervals(intervals)
        def expect = 2

        assert actual == expect
    }

    void testRemoveCoveredIntervals5() {
        int[][] intervals = [[1,2],[1,4],[3,4]]
        RemoveCoveredIntervalsSort removeCoveredIntervalsSort = new RemoveCoveredIntervalsSort()
        def actual = removeCoveredIntervalsSort.removeCoveredIntervals(intervals)
        def expect = 1

        assert actual == expect
    }
}
