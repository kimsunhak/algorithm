### [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Math` `Dynamic Programming` `Memoization`

```kotlin
class Solution {
    private val mutableMap = mutableMapOf<Int, Int>()
    fun climbStairs(n: Int): Int = when(n) {
        0 -> 0
        1 -> 1
        2 -> 2
        // n번째 key 추가 및 값 반환
        else -> mutableMap.getOrPut(n) {
            climbStairs(n - 1) + climbStairs(n - 2)
        }
    }
}
```

