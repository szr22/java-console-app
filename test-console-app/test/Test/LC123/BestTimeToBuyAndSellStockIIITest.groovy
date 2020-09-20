package Test.LC123

import com.company.LC123.BestTimeToBuyAndSellStockIII

class BestTimeToBuyAndSellStockIIITest extends GroovyTestCase {
    void testMaxProfit1() {
        int[] prices = [3, 3, 5, 0, 0, 3, 1, 4]
        BestTimeToBuyAndSellStockIII bestTimeToBuyAndSellStockIII = new BestTimeToBuyAndSellStockIII()
        def actual = bestTimeToBuyAndSellStockIII.maxProfit(prices)
        def expect = 6

        assert actual == expect
    }

    void testMaxProfit2() {
        int[] prices = [1,2,3,4,5]
        BestTimeToBuyAndSellStockIII bestTimeToBuyAndSellStockIII = new BestTimeToBuyAndSellStockIII()
        def actual = bestTimeToBuyAndSellStockIII.maxProfit(prices)
        def expect = 4

        assert actual == expect
    }

    void testMaxProfit3() {
        int[] prices = [7,6,4,3,1]
        BestTimeToBuyAndSellStockIII bestTimeToBuyAndSellStockIII = new BestTimeToBuyAndSellStockIII()
        def actual = bestTimeToBuyAndSellStockIII.maxProfit(prices)
        def expect = 0

        assert actual == expect
    }
}
