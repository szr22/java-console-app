package Test.LC316

import com.company.LC316.RemoveDuplicateLetters

class RemoveDuplicateLettersTest extends GroovyTestCase {
    void testRemoveDuplicateLetters1() {
        def s = "bcabc"
        RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters()
        def actual = removeDuplicateLetters.removeDuplicateLetters(s)
        def expect = "abc"

        assert expect == actual
    }

    void testRemoveDuplicateLetters2() {
        def s = "cbacdcbc"
        RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters()
        def actual = removeDuplicateLetters.removeDuplicateLetters(s)
        def expect = "acdb"

        assert expect == actual
    }
}
