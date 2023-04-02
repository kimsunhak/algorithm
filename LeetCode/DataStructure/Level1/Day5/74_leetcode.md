### [74. Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/description/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Binary Search` `Matrix`

```kotlin
class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var result: IntArray = intArrayOf()
        for(i in matrix){
            result += i
        }
        return result.contains(target)
    }
}
```

