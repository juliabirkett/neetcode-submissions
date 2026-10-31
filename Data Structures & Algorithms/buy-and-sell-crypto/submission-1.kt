class Solution {
    fun maxProfit(prices: IntArray): Int {
        val siz = prices.size
        if (siz == 1) return 0
        var leftW = 0
        var rightW = siz - 1
        var price = 0
        
        while (leftW <= rightW) {
            if (leftW == rightW) {
                leftW++
                rightW = siz - 1
            }
            val calc = prices[rightW] - prices[leftW]
            
            if (calc > price) {
                price = calc
            }
            rightW--
        } 

        return price
    }
}
