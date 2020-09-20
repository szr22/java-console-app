package Test.LC188

import com.company.LC188.BestTimeToBuyAndSellStockIV

class BestTimeToBuyAndSellStockIVTest extends GroovyTestCase {
    void testMaxProfit1() {
        int[] prices = [2,4,1]
        int k = 2

        BestTimeToBuyAndSellStockIV bestTimeToBuyAndSellStockIV = new BestTimeToBuyAndSellStockIV()
        def actual = bestTimeToBuyAndSellStockIV.maxProfit(k, prices)
        def expect = 2

        assert actual == expect
    }

    void testMaxProfit2() {
        int[] prices = [3,2,6,5,0,3]
        int k = 2

        BestTimeToBuyAndSellStockIV bestTimeToBuyAndSellStockIV = new BestTimeToBuyAndSellStockIV()
        def actual = bestTimeToBuyAndSellStockIV.maxProfit(k, prices)
        def expect = 7

        assert actual == expect
    }

    void testMaxProfit3() {
        int[] prices = [1,2,4,2,5,7,2,4,9,0]
        int k = 4

        BestTimeToBuyAndSellStockIV bestTimeToBuyAndSellStockIV = new BestTimeToBuyAndSellStockIV()
        def actual = bestTimeToBuyAndSellStockIV.maxProfit(k, prices)
        def expect = 15

        assert actual == expect
    }
}
