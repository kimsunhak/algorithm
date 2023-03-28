### [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Divide and Conquer`

```kotlin
class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var max = nums[0]

        nums.forEach{
            if (sum < 0) sum = 0
            sum += it
            max = Math.max(max, sum)
        }

        return max
    }
}
```

