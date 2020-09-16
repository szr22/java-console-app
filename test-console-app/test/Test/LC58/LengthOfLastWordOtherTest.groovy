package Test.LC58

import com.company.LC58.LengthOfLastWordOther

class LengthOfLastWordOtherTest extends GroovyTestCase {
    void testLengthOfLastWord() {
        String s = "Hello World"
        LengthOfLastWordOther lengthOfLastWordOther = new LengthOfLastWordOther()
        def actual = lengthOfLastWordOther.lengthOfLastWord(s)
        def expect = 5

        assert actual == expect
    }
}
