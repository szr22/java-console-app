package Test.LC459

import com.company.LC459.RepeatedSubstringPattern
import org.junit.Test

class RepeatedSubstringPatternTest extends GroovyTestCase {

    @Test
    void testRepeatedSubstringPattern1() {
        def repeatedSubstringPattern = new RepeatedSubstringPattern()
        String s = "abab"
        def res = repeatedSubstringPattern.repeatedSubstringPattern(s)

        assert res == true
    }

    @Test
    void testRepeatedSubstringPattern2() {
        def repeatedSubstringPattern = new RepeatedSubstringPattern()
        String s = "aba"
        def res = repeatedSubstringPattern.repeatedSubstringPattern(s)

        assert res == false
    }

    @Test
    void testRepeatedSubstringPattern3() {
        def repeatedSubstringPattern = new RepeatedSubstringPattern()
        String s = "abcabcabcabc"
        def res = repeatedSubstringPattern.repeatedSubstringPattern(s)

        assert res == true
    }
}
