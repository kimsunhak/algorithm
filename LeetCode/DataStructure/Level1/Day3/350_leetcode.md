### [350. Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Array` `Hash Table` `Two Pointers` `Binary Search` `Sorting`

```kotlin
class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val mutableList = mutableListOf<Int>()
        nums1.sort()
        nums2.sort()
        for (i in nums1.indices) {
            for (j in nums2.indices) {
                if (nums1[i] == nums2[j]) {
                    mutableList.add(nums1[i])
                    nums1[i] = -1
                    nums2[j] = -1
                }
            }
        }
        return mutableList.toIntArray()
    }
}
```

