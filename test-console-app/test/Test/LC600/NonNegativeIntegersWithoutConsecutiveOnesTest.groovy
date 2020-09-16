package Test.LC600

import com.company.LC600.NonNegativeIntegersWithoutConsecutiveOnes

class NonNegativeIntegersWithoutConsecutiveOnesTest extends GroovyTestCase {
    void testFindIntegers() {
        NonNegativeIntegersWithoutConsecutiveOnes negativeIntegersWithoutConsecutiveOnes = new NonNegativeIntegersWithoutConsecutiveOnes()

        def actual = negativeIntegersWithoutConsecutiveOnes.findIntegers(5)
        def expect = 5

        assert actual==expect
    }
}
