### [1. Two Sum](https://leetcode.com/problems/two-sum/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Array` `Hash Table`

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

```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mutableMap: MutableMap<Int, Int> = mutableMapOf()
        
        nums.forEachIndexed { i, num -> 
            if (mutableMap.containsKey(num)) {
                return intArrayOf(mutableMap[num]!!, i)
            }
            mutableMap[target - num] = i
        }
        
        return intArrayOf()
    }
}

```

