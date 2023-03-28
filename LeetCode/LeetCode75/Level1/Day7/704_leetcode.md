### [704. Binary Search](https://leetcode.com/problems/binary-search/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Array` `Binary Search`

```kotlin
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return -1
    }
}
```

