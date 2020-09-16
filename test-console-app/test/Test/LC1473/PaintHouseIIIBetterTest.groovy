package Test.LC1473

import com.company.LC1473.PaintHouseIIIBetter

class PaintHouseIIIBetterTest extends GroovyTestCase {
    void testMinCost1() {
        int[] houses = [0,0,0,0,0]
        int[][] cost = [[1,10],[10,1],[10,1],[1,10],[5,1]]
        int m = 5, n = 2, target = 3
        PaintHouseIIIBetter paintHouseIIIBetter = new PaintHouseIIIBetter()

        int actual = paintHouseIIIBetter.minCost(houses, cost, m, n, target)
        def expect = 9

        assert actual==expect
    }

    void testMinCost2() {
        int[] houses = [0,2,1,2,0]
        int[][] cost = [[1,10],[10,1],[10,1],[1,10],[5,1]]
        int m = 5, n = 2, target = 3
        PaintHouseIIIBetter paintHouseIIIBetter = new PaintHouseIIIBetter()

        int actual = paintHouseIIIBetter.minCost(houses, cost, m, n, target)
        def expect = 11

        assert actual==expect
    }

    void testMinCost3() {
        int[] houses = [0,0,0,0,0]
        int[][] cost = [[1,10],[10,1],[1,10],[10,1],[1,10]]
        int m = 5, n = 2, target = 5
        PaintHouseIIIBetter paintHouseIIIBetter = new PaintHouseIIIBetter()

        int actual = paintHouseIIIBetter.minCost(houses, cost, m, n, target)
        def expect = 5

        assert actual==expect
    }

    void testMinCost4() {
        int[] houses = [3,1,2,3]
        int[][] cost = [[1,1,1],[1,1,1],[1,1,1],[1,1,1]]
        int m = 4, n = 3, target = 3
        PaintHouseIIIBetter paintHouseIIIBetter = new PaintHouseIIIBetter()

        int actual = paintHouseIIIBetter.minCost(houses, cost, m, n, target)
        def expect = -1

        assert actual==expect
    }
}
