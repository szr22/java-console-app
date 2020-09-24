package Test.LC134

import com.company.LC134.GasStation

class GasStationTest extends GroovyTestCase {
    void testCanCompleteCircuit1() {
        int[] gas = [1,2,3,4,5]
        int[] cost = [3,4,5,1,2]
        GasStation gasStation = new GasStation()
        def actual = gasStation.canCompleteCircuit(gas, cost)
        def expect = 3

        assert actual==expect
    }

    void testCanCompleteCircuit2() {
        int[] gas = [2,3,4]
        int[] cost = [3,4,3]
        GasStation gasStation = new GasStation()
        def actual = gasStation.canCompleteCircuit(gas, cost)
        def expect = -1

        assert actual==expect
    }
}
