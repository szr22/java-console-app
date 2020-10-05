package Test.LC1009

import com.company.LC1009.ComplementOfBase10Integer

class ComplementOfBase10IntegerTest extends GroovyTestCase {
    void testBitwiseComplement1() {
        ComplementOfBase10Integer complementOfBase10Integer = new ComplementOfBase10Integer()

        int N = 5
        def actual = complementOfBase10Integer.bitwiseComplement(N)
        def expect = 2

        assert actual==expect
    }

    void testBitwiseComplement2() {
        ComplementOfBase10Integer complementOfBase10Integer = new ComplementOfBase10Integer()

        int N = 7
        def actual = complementOfBase10Integer.bitwiseComplement(N)
        def expect = 0

        assert actual==expect
    }

    void testBitwiseComplement3() {
        ComplementOfBase10Integer complementOfBase10Integer = new ComplementOfBase10Integer()

        int N = 10
        def actual = complementOfBase10Integer.bitwiseComplement(N)
        def expect = 5

        assert actual==expect
    }
}
