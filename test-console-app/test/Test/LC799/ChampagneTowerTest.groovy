package Test.LC799

import com.company.LC799.ChampagneTower

class ChampagneTowerTest extends GroovyTestCase {
    void testChampagneTower1(){
        def poured = 1, query_row = 1, query_glass = 1
        ChampagneTower champagneTower = new ChampagneTower()
        def actual = champagneTower.champagneTower(poured, query_row, query_glass)
        def expect = 0.00000
        assert  actual==expect
    }

    void testChampagneTower2(){
        def poured = 2, query_row = 1, query_glass = 1
        ChampagneTower champagneTower = new ChampagneTower()
        def actual = champagneTower.champagneTower(poured, query_row, query_glass)
        def expect = 0.50000
        assert  actual==expect
    }

    void testChampagneTower3(){
        def poured = 100000009, query_row = 33, query_glass = 17
        ChampagneTower champagneTower = new ChampagneTower()
        def actual = champagneTower.champagneTower(poured, query_row, query_glass)
        def expect = 1.00000
        assert  actual==expect
    }
}
