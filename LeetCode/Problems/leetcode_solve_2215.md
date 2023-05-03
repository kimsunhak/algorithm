### [2215. Find the Difference of Two Arrays](https://leetcode.com/problems/find-the-difference-of-two-arrays/)

##### Language : Kotlin

##### Tags: `Array` `Hash Table`

```kotlin
class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val nums1ToSet = nums1.toSet()
        val nums2ToSet = nums2.toSet()

        return listOf(
                nums1ToSet.filter { num1 ->
                    !nums2ToSet.contains(num1)
                },
                nums2ToSet.filter { num2 ->
                    !nums1ToSet.contains(num2)
                }
        )
    }
}
```

