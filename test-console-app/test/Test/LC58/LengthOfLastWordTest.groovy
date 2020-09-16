package Test.LC58

import com.company.LC58.LengthOfLastWord

class LengthOfLastWordTest extends GroovyTestCase {
    void testLengthOfLastWord() {
        String s = "Hello World"
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord()
        def actual = lengthOfLastWord.lengthOfLastWord(s)
        def expect = 5

        assert actual == expect
    }
}
