### [509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: Math Dynamic Programming Recursion Memoization

```kotlin
class Solution {
    fun fib(n: Int): Int = when(n) {
        0 -> 0
        1 -> 1
        else -> fib(n - 1) + fib(n - 2)
    }
}
```

