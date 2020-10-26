package Test.LC1510

import com.company.LC1510.StoneGameIV

class StoneGameIVTest extends GroovyTestCase {
    void testWinnerSquareGame1() {
        def n=1
        StoneGameIV stoneGameIV = new StoneGameIV()
        def actual = stoneGameIV.winnerSquareGame(n)
        def expect = true
        assert actual==expect
    }

    void testWinnerSquareGame2() {
        def n=2
        StoneGameIV stoneGameIV = new StoneGameIV()
        def actual = stoneGameIV.winnerSquareGame(n)
        def expect = false
        assert actual==expect
    }

    void testWinnerSquareGame3() {
        def n=4
        StoneGameIV stoneGameIV = new StoneGameIV()
        def actual = stoneGameIV.winnerSquareGame(n)
        def expect = true
        assert actual==expect
    }

    void testWinnerSquareGame4() {
        def n=7
        StoneGameIV stoneGameIV = new StoneGameIV()
        def actual = stoneGameIV.winnerSquareGame(n)
        def expect = false
        assert actual==expect
    }

    void testWinnerSquareGame5() {
        def n=17
        StoneGameIV stoneGameIV = new StoneGameIV()
        def actual = stoneGameIV.winnerSquareGame(n)
        def expect = false
        assert actual==expect
    }
}
