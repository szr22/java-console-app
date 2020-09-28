package Test.LC495

import com.company.LC495.TeemoAttacking

class TeemoAttackingTest extends GroovyTestCase {
    void testFindPoisonedDuration1() {
        int[] timeSeries = [1,4]
        int duration = 2
        TeemoAttacking teemoAttacking = new TeemoAttacking()
        def actual = teemoAttacking.findPoisonedDuration(timeSeries, duration)
        def expect = 4

        assert actual == expect
    }

    void testFindPoisonedDuration2() {
        int[] timeSeries = [1,2]
        int duration = 2
        TeemoAttacking teemoAttacking = new TeemoAttacking()
        def actual = teemoAttacking.findPoisonedDuration(timeSeries, duration)
        def expect = 3

        assert actual == expect
    }
}
