package Test.LC122

import com.company.LC122.BestTimeToBuyAndSellStockII

class BestTimeToBuyAndSellStockIITest extends GroovyTestCase {
    void testMaxProfit1() {
        int[] prices = [7,1,5,3,6,4]
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII()
        def actual = bestTimeToBuyAndSellStockII.maxProfit(prices)
        def expect = 7

        assert actual == expect
    }

    void testMaxProfit2() {
        int[] prices = [1,2,3,4,5]
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII()
        def actual = bestTimeToBuyAndSellStockII.maxProfit(prices)
        def expect = 4

        assert actual == expect
    }

    void testMaxProfit3() {
        int[] prices = [7,6,4,3,1]
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII()
        def actual = bestTimeToBuyAndSellStockII.maxProfit(prices)
        def expect = 0

        assert actual == expect
    }
}
