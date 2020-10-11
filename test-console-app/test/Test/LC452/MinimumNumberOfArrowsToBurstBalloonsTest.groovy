package Test.LC452

import com.company.LC452.MinimumNumberOfArrowsToBurstBalloons

class MinimumNumberOfArrowsToBurstBalloonsTest extends GroovyTestCase {
    void testFindMinArrowShots1() {
        int[][] points = [[10,16],[2,8],[1,6],[7,12]]
        MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons()
        def actual = minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points)
        def expect = 2

        actual == expect
    }

    void testFindMinArrowShots2() {
        int[][] points = [[1,2],[3,4],[5,6],[7,8]]
        MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons()
        def actual = minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points)
        def expect = 4

        actual == expect
    }

    void testFindMinArrowShots3() {
        int[][] points = [[1,2],[2,3],[3,4],[4,5]]
        MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons()
        def actual = minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points)
        def expect = 2

        actual == expect
    }

    void testFindMinArrowShots4() {
        int[][] points = [[1,2]]
        MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons()
        def actual = minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points)
        def expect = 1

        actual == expect
    }

    void testFindMinArrowShots5() {
        int[][] points = [[2,3],[2,3]]
        MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons()
        def actual = minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points)
        def expect = 1

        actual == expect
    }

    void testFindMinArrowShots6() {
        int[][] points = [[-2147483646,-2147483645],[2147483646,2147483647]]
        MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons()
        def actual = minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points)
        def expect = 2

        actual == expect
    }
}
