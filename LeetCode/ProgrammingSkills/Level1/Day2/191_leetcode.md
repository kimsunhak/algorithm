### [191. Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/description/?envType=study-plan&id=programming-skills-i)

##### Language : Kotlin

##### Tags: `Divide and Conquer` `Bit Manipulation`

```kotlin
class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        val binary = Integer.toBinaryString(n)
        return binary.filter { it ->
            it == '1'
        }.length
    }
}
```

