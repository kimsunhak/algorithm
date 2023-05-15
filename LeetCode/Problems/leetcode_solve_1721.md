### [1721. Swapping Nodes in a Linked List](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/)

##### Language : Kotlin

##### Tags: `Linked List` `Two Pointers`

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
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        var left: ListNode? = head
        var right: ListNode? = head

        for (i in 1 until k) {
            left = left?.next
        }

        var cursor = left
        while (cursor?.next != null) {
            cursor = cursor?.next
            right = right?.next
        }

        // left and right must be not null
        left = left ?: return null
        right = right ?: return null
        
        // swap
        val temp = left.`val`
        left.`val` = right.`val`
        right.`val` = temp
        
        return head
    }
}
```

