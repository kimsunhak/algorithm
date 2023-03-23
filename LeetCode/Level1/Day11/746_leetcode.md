### [746. Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/description/)

##### Language : Kotlin

##### Tags: Array Dynamic Programming

```kotlin
class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        
        for (i in 2 until cost.size) {
            cost[i] += cost[i - 1].coerceAtMost(cost[i - 2])
        }

        return cost[cost.size - 1].coerceAtMost(cost[cost.size - 2])
    }
}
```

