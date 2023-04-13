### [1779. Find Nearest Point That Has the Same X or Y Coordinate](https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/?envType=study-plan&id=programming-skills-i)

##### Language : Kotlin

##### Tags: `Array`

```kotlin
class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var min = Int.MAX_VALUE
        var index = -1

        for (i in points.indices) {
            val dx = x - points[i][0]
            val dy = y - points[i][1]
            if (dx * dy == 0 && Math.abs(dx - dy) < min) {
                min = Math.abs(dx - dy)
                index = i
            }
        }

        return index
    }
}
```

