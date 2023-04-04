### [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Linked List`

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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        val result = head
        while (current?.next != null) {
            if (current.`val` == current.next?.`val`) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }
        return result
    }
}
```

