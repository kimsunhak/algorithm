### [1779. Find Nearest Point That Has the Same X or Y Coordinate](https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/?envType=study-plan&id=programming-skills-i)

##### Language : Kotlin

##### Tags: `Array` `Math` `Greedy` `Sorting`

```kotlin
class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        val num = nums.sorted()

        for (i in num.size - 1 downTo 2) {
            if (num[i - 1] + num[i - 2] > num[i]) {
                return num[i - 2] + num[i - 1] + num[i]
            }
        }
        return 0
    }
}
```

