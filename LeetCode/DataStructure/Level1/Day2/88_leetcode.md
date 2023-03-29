### [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Two Pointers` `Sorting`

```kotlin
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        nums2.forEachIndexed {index, value ->
            nums1[m + index] = value
        }
        nums1.sort()
    }
}
```

