package Test.LC139

import com.company.LC139.WordBreakTrie

class WordBreakTrieTest extends GroovyTestCase {
    void testWordBreak1() {
        String s = "leetcode"
        List<String> wordDict = ["leet", "code"]
        WordBreakTrie wordBreakTrie = new WordBreakTrie()
        def actual = wordBreakTrie.wordBreak(s, wordDict)
        def expect = true

        assert actual == expect
    }

    void testWordBreak2() {
        String s = "applepenapple"
        List<String> wordDict = ["apple", "pen"]
        WordBreakTrie wordBreakTrie = new WordBreakTrie()
        def actual = wordBreakTrie.wordBreak(s, wordDict)
        def expect = true

        assert actual == expect
    }
}
