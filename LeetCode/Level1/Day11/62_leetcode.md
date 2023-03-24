### [62. Unique Paths](https://leetcode.com/problems/unique-paths/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Math` `Dynamic Programming` `Combinatorics`

```kotlin
class Solution {
    fun uniquePaths(m: Int, n: Int): Int {

        val answer = IntArray(n){1}

        for (i in 1 until m) {
            for (j in 1 until n) {
                answer[j] += answer[j - 1]
            }
        }

        return answer[n - 1]
    }
}
```

