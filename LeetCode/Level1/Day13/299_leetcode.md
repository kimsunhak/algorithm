### [299. Bulls and Cows](https://leetcode.com/problems/bulls-and-cows/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Hash Table` `String` `Counting`

```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val targetCheck = target - nums[i]

            if (map.contains(targetCheck)) {
                return intArrayOf(map[targetCheck]!!, i)
            }

            // kotlin put method
            map[nums[i]] = i
        }
        return intArrayOf(-1, -1)
    }
}
```

