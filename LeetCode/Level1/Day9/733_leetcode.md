### [733. Flood Fill](https://leetcode.com/problems/flood-fill/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Array` `Depth-First Search` `Breadth-First Search` `Matrix`

```kotlin
class Solution {
 
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        
        if (image[sr][sc] != color) positionColor(image, sr, sc, color, image[sr][sc])

        return image
    }
    
    private fun positionColor(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int, originColor: Int): Array<IntArray> {
        if (sr < 0 || sr >= image.size) return image

        if (sc < 0 || sc >= image.first().size) return image

        if (image[sr][sc] != originColor) return image

        image[sr][sc] = newColor

        positionColor(image, sr + 1, sc, newColor, originColor) // 위
        positionColor(image, sr - 1, sc, newColor, originColor) // 아래
        positionColor(image, sr, sc + 1, newColor, originColor) // 왼쪽
        positionColor(image, sr, sc - 1, newColor, originColor) // 오른쪽
        return image
    }
}
```

