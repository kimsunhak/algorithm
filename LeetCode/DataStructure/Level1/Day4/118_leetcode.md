### [118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Dynamic Programming`

```kotlin
class Solution {
    fun generate(numRows: Int): List<List<Int>> {

        val result = ArrayList<List<Int>>()

        for (i in 0 until numRows) {
            val list = ArrayList<Int>()
            for (j in 0..i) {
                if (j == 0 || j == i) {
                    list.add(1)
                } else {
                    list.add(result.last()[j-1] + result.last()[j])
                }
            }

            result.add(list)
        }

        return result
    }
}
```

