package Test.LC291

import com.company.LC291.WordPatternIISet
import org.junit.Test

class WordPatternIISetTest extends GroovyTestCase {
    @Test
    void testWordPattern1() {
        def wordPatternIISet = new WordPatternIISet();
        def pattern = "abab"
        def str = "redblueredblue"
        def res = wordPatternIISet.wordPattern(pattern, str);

        assert res == true
    }

    @Test
    void testWordPattern2() {
        def wordPatternIISet = new WordPatternIISet();
        def pattern = "aaaa"
        def str = "asdasdasdasd"
        def res = wordPatternIISet.wordPattern(pattern, str);

        assert res == true
    }

    @Test
    void testWordPattern3() {
        def wordPatternIISet = new WordPatternIISet();
        def pattern = "aabb"
        def str = "xyzabcxzyabc"
        def res = wordPatternIISet.wordPattern(pattern, str);

        assert res == false
    }
}
