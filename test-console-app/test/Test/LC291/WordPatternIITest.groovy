package Test.LC291

import com.company.LC291.WordPatternII
import org.junit.Test

class WordPatternIITest extends GroovyTestCase {

    @Test
    void testWordPattern1() {
        def wordPatternII = new WordPatternII();
        def pattern = "abab"
        def str = "redblueredblue"
        def res = wordPatternII.wordPattern(pattern, str);

        assert res == true
    }

    @Test
    void testWordPattern2() {
        def wordPatternII = new WordPatternII();
        def pattern = "aaaa"
        def str = "asdasdasdasd"
        def res = wordPatternII.wordPattern(pattern, str);

        assert res == true
    }

    @Test
    void testWordPattern3() {
        def wordPatternII = new WordPatternII();
        def pattern = "aabb"
        def str = "xyzabcxzyabc"
        def res = wordPatternII.wordPattern(pattern, str);

        assert res == false
    }
}
