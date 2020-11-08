package Test.LC849

import com.company.LC849.MaximizeDistanceToClosestPerson

class MaximizeDistanceToClosestPersonTest extends GroovyTestCase {
    void testMaxDistToClosest1() {
        int[] seats = [1,0,0,0]
        MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson = new MaximizeDistanceToClosestPerson()
        def actual = maximizeDistanceToClosestPerson.maxDistToClosest(seats)
        def expect = 3
        assert actual == expect
    }

    void testMaxDistToClosest2() {
        int[] seats = [0,1]
        MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson = new MaximizeDistanceToClosestPerson()
        def actual = maximizeDistanceToClosestPerson.maxDistToClosest(seats)
        def expect = 1
        assert actual == expect
    }
}
