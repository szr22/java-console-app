package Test.LC1291

import Test.utils.Helper
import com.company.LC1291.SequentialDigits

class SequentialDigitsTest extends GroovyTestCase {
    void testSequentialDigits1() {
        def low = 100, high = 300
        SequentialDigits sequentialDigits = new SequentialDigits()
        def actual = sequentialDigits.sequentialDigits(low, high)
        def expect = [123, 234]

        Helper.checkArray(actual, expect)
    }

    void testSequentialDigits2() {
        def low = 1000, high = 13000
        SequentialDigits sequentialDigits = new SequentialDigits()
        def actual = sequentialDigits.sequentialDigits(low, high)
        def expect = [1234,2345,3456,4567,5678,6789,12345]

        Helper.checkArray(actual, expect)
    }

    void testSequentialDigits3() {
        def low = 100, high = 300
        SequentialDigits sequentialDigits = new SequentialDigits()
        def actual = sequentialDigits.sequentialDigitsBetter(low, high)
        def expect = [123, 234]

        Helper.checkArray(actual, expect)
    }

    void testSequentialDigits4() {
        def low = 1000, high = 13000
        SequentialDigits sequentialDigits = new SequentialDigits()
        def actual = sequentialDigits.sequentialDigitsBetter(low, high)
        def expect = [1234, 2345, 3456, 4567, 5678, 6789, 12345]

        Helper.checkArray(actual, expect)
    }
}
