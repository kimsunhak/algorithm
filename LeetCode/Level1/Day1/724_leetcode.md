### [724.Find Pivot Index](https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: Array Prefix Sum

```kotlin
class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var rightSum = 0
        var leftSum = 0

        for (i in 1 until nums.size) {
            rightSum += nums[i]
        }

        for (i in nums.indices) {
            if (i > 0) {
                leftSum += nums[i - 1]
                rightSum -= nums[i]
            }

            if (leftSum == rightSum) {
                return i
            }
        }
        // no such index
        return -1
    }
}
```

