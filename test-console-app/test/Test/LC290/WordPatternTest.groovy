package Test.LC290

import com.company.LC290.WordPattern
import org.junit.Test

class WordPatternTest extends GroovyTestCase {

    @Test
    void testWordPattern1() {
        def wordPattern = new WordPattern();
        def pattern = "abba"
        def str = "dog cat cat dog"
        def res = wordPattern.wordPattern(pattern, str);

        assert res == true
    }

    @Test
    void testWordPattern2() {
        def wordPattern = new WordPattern();
        def pattern = "aaaa"
        def str = "dog cat cat dog"
        def res = wordPattern.wordPattern(pattern, str);

        assert res == false
    }

    @Test
    void testWordPattern3() {
        def wordPattern = new WordPattern();
        def pattern = "abba"
        def str = "dog cat cat fish"
        def res = wordPattern.wordPattern(pattern, str);

        assert res == false
    }

    @Test
    void testWordPattern4() {
        def wordPattern = new WordPattern();
        def pattern = "abba"
        def str = "dog dog dog dog"
        def res = wordPattern.wordPattern(pattern, str);

        assert res == false
    }
}
