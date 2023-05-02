### [1822. Sign of the Product of an Array](https://leetcode.com/problems/sign-of-the-product-of-an-array/)

##### Language : Kotlin

##### Tags: `Array` `Math`

```kotlin
class Solution {
    fun arraySign(nums: IntArray): Int {
        var product = 1

        nums.forEach {
            when {
                num == 0 -> return 0
                num < 0 -> product *= -1
            }
        }

        return product
    }
}
```

