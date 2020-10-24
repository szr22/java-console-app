package Test.LC187

import Test.utils.Helper
import com.company.LC187.RepeatedDNASequences

class RepeatedDNASequencesTest extends GroovyTestCase {
    void testFindRepeatedDnaSequences1() {
        def s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        RepeatedDNASequences repeatedDNASequences = new RepeatedDNASequences ()
        def actual = repeatedDNASequences.findRepeatedDnaSequences(s)
        def expect = ["AAAAACCCCC","CCCCCAAAAA"]
        Helper.checkArray(actual, expect)
    }

    void testFindRepeatedDnaSequences2() {
        def s = "AAAAAAAAAAAAA"
        RepeatedDNASequences repeatedDNASequences = new RepeatedDNASequences ()
        def actual = repeatedDNASequences.findRepeatedDnaSequences(s)
        def expect = ["AAAAAAAAAA"]
        Helper.checkArray(actual, expect)
    }
}
