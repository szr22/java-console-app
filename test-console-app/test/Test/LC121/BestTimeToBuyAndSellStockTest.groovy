package Test.LC121

import com.company.LC121.BestTimeToBuyAndSellStock

class BestTimeToBuyAndSellStockTest extends GroovyTestCase {
    void testMaxProfit1() {
        int[] prices = [7,1,5,3,6,4]
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock()

        def actual = bestTimeToBuyAndSellStock.maxProfit(prices)
        def expect = 5

        assert actual == expect
    }

    void testMaxProfit2() {
        int[] prices = [7,6,4,3,1]
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock()

        def actual = bestTimeToBuyAndSellStock.maxProfit(prices)
        def expect = 0

        assert actual == expect
    }
}
