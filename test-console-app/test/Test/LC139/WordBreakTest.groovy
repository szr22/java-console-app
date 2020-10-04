package Test.LC139

import com.company.LC139.WordBreak

class WordBreakTest extends GroovyTestCase {
    void testWordBreak1() {
        String s = "leetcode"
        List<String> wordDict = ["leet", "code"]
        WordBreak wordBreak = new WordBreak()
        def actual = wordBreak.wordBreak(s, wordDict)
        def expect = true

        assert actual == expect
    }

    void testWordBreak2() {
        String s = "applepenapple"
        List<String> wordDict = ["apple", "pen"]
        WordBreak wordBreak = new WordBreak()
        def actual = wordBreak.wordBreak(s, wordDict)
        def expect = true

        assert actual == expect
    }
}
