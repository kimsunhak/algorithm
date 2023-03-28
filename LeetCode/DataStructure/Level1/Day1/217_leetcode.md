### [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Hash Table` `Sorting`

```kotlin
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size < nums.size
    }
}
```

