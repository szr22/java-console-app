package Test.LC1446

import com.company.LC1446.ConsecutiveCharacters

class ConsecutiveCharactersTest extends GroovyTestCase {
    void testTaxPower1() {
        def s = "leetcode"
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters()
        def actual = consecutiveCharacters.maxPower(s)
        def expect = 2
        assert actual==expect
    }

    void testTaxPower2() {
        def s = "abbcccddddeeeeedcba"
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters()
        def actual = consecutiveCharacters.maxPower(s)
        def expect = 5
        assert actual==expect
    }

    void testTaxPower3() {
        def s = "triplepillooooow"
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters()
        def actual = consecutiveCharacters.maxPower(s)
        def expect = 5
        assert actual==expect
    }

    void testTaxPower4() {
        def s = "hooraaaaaaaaaaay"
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters()
        def actual = consecutiveCharacters.maxPower(s)
        def expect = 11
        assert actual==expect
    }

    void testTaxPower5() {
        def s = "tourist"
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters()
        def actual = consecutiveCharacters.maxPower(s)
        def expect = 1
        assert actual==expect
    }
}
