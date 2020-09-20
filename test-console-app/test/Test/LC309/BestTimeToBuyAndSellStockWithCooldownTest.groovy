package Test.LC309

import com.company.LC309.BestTimeToBuyAndSellStockWithCooldown

class BestTimeToBuyAndSellStockWithCooldownTest extends GroovyTestCase {
    void testmaxProfit() {
        int[] prices = [1,2,3,0,2]
        BestTimeToBuyAndSellStockWithCooldown bestTimeToBuyAndSellStockWithCooldown = new BestTimeToBuyAndSellStockWithCooldown()
        def actual = bestTimeToBuyAndSellStockWithCooldown.maxProfit(prices)
        def expect = 3

        assert actual == expect
    }
}
