package TestLC1217

import com.company.LC1217.MinimumCostToMoveChipsToTheSamePosition

class MinimumCostToMoveChipsToTheSamePositionTest extends GroovyTestCase {
    void testMinCostToMoveChips1() {
        int[] position = [1,2,3]
        MinimumCostToMoveChipsToTheSamePosition minimumCostToMoveChipsToTheSamePosition = new MinimumCostToMoveChipsToTheSamePosition()
        def actual = minimumCostToMoveChipsToTheSamePosition.minCostToMoveChips(position)
        def expect = 1
        assert actual == expect
    }

    void testMinCostToMoveChips2() {
        int[] position = [2,2,2,3,3]
        MinimumCostToMoveChipsToTheSamePosition minimumCostToMoveChipsToTheSamePosition = new MinimumCostToMoveChipsToTheSamePosition()
        def actual = minimumCostToMoveChipsToTheSamePosition.minCostToMoveChips(position)
        def expect = 2
        assert actual == expect
    }

    void testMinCostToMoveChips3() {
        int[] position = [1,1000000000]
        MinimumCostToMoveChipsToTheSamePosition minimumCostToMoveChipsToTheSamePosition = new MinimumCostToMoveChipsToTheSamePosition()
        def actual = minimumCostToMoveChipsToTheSamePosition.minCostToMoveChips(position)
        def expect = 1
        assert actual == expect
    }
}
