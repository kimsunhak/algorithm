### [1480.Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: Array Prefix Sum

```kotlin
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] = nums[i] + nums[i-1]
        }
        return nums
    }
}
```

