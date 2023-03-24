### [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: `Linked List` `Recursion`

```kotlin
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) return null
        if (list1 == null) return list2
        if (list2 == null) return list1

        if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        }

        list2.next = mergeTwoLists(list2.next, list1)
        return list2
    }
}
```

