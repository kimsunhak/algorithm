### [566. Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Matrix` `Simulation`

```kotlin
class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r * c) return mat
    
        val result = Array(r) { IntArray(c) }
        
        var row = 0
        var col = 0
        
        for (i in mat.indices) {
            for (j in mat[i].indices) {
                result[row][col] = mat[i][j]
                col++
                if (col == c) {
                    col = 0
                    row++
                }
            }
        }
        
        return result
    }
}
```

