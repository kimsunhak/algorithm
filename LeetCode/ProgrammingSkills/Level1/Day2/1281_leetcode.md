### [1281. Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/?envType=study-plan&id=programming-skills-i)

##### Language : Kotlin

##### Tags: `Math`

```kotlin
class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var sum:Int = 0
        var product:Int = 1
        val numToString:String = n.toString()

        numToString.forEach { it ->
            product *= it.toString().toInt()
            sum += it.toString().toInt()
        }

        return product - sum
    }
}
```

