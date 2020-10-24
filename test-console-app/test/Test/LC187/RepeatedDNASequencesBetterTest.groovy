package Test.LC187

import Test.utils.Helper
import com.company.LC187.RepeatedDNASequencesBetter

class RepeatedDNASequencesBetterTest extends GroovyTestCase {
    void testFindRepeatedDnaSequences1() {
        def s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        RepeatedDNASequencesBetter repeatedDNASequencesBetter = new RepeatedDNASequencesBetter ()
        def actual = repeatedDNASequencesBetter.findRepeatedDnaSequences(s)
        def expect = ["AAAAACCCCC","CCCCCAAAAA"]
        Helper.checkArray(actual, expect)
    }

    void testFindRepeatedDnaSequences2() {
        def s = "AAAAAAAAAAAAA"
        RepeatedDNASequencesBetter repeatedDNASequencesBetter = new RepeatedDNASequencesBetter ()
        def actual = repeatedDNASequencesBetter.findRepeatedDnaSequences(s)
        def expect = ["AAAAAAAAAA"]
        Helper.checkArray(actual, expect)
    }
}
