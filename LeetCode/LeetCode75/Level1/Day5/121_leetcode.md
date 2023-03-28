### [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Array` `Dynamic Programming`

```kotlin
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var max = 0
        prices.forEach {
            if (it < min) min = it
            max = maxOf(max, it - min)
        }
        return max
    }
}
```

