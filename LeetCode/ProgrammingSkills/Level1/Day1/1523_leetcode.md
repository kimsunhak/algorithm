### [1523. Count Odd Numbers in an Interval Range](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/?envType=study-plan&id=programming-skills-i)

##### Language : Kotlin

##### Tags: `Math`

```kotlin
class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var result: Int = 0
        for (i in low..high) {
            if (i % 2 == 1) {
                result++
            }
        }
        return result
    }
}
```

