package Test.LC948

import com.company.LC948.BagOfTokens

class BagOfTokensTest extends GroovyTestCase {
    void testBagOfTokensScore1() {
        int[] tokens = [100]
        int P = 0
        BagOfTokens bagOfTokens = new BagOfTokens()
        def actual = bagOfTokens.bagOfTokensScore(tokens, P)
        def expect = 0

        assert actual==expect
    }

    void testBagOfTokensScore2() {
        int[] tokens = [100,200]
        int P = 150
        BagOfTokens bagOfTokens = new BagOfTokens()
        def actual = bagOfTokens.bagOfTokensScore(tokens, P)
        def expect = 1

        assert actual==expect
    }

    void testBagOfTokensScore3() {
        int[] tokens = [100,200,300,400]
        int P = 200
        BagOfTokens bagOfTokens = new BagOfTokens()
        def actual = bagOfTokens.bagOfTokensScore(tokens, P)
        def expect = 2

        assert actual==expect
    }
}
