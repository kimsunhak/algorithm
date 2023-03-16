### [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: Hash Table Linked List Two Pointers

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
    fun detectCycle(head: ListNode?): ListNode? {
        var mutableSet = mutableSetOf<ListNode>()
        var pointer = head

        while (pointer != null) {
            if (!mutableSet.contains(pointer)) {
                mutableSet.add(pointer)
                pointer = pointer?.next
            } else {
                return pointer
            }
        }
        
        return null
    }
}
```
