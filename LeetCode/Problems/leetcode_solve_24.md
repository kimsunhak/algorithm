### [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/description/)

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
    fun swapPairs(head: ListNode?): ListNode? {
        var left = head
        var right = head?.next

        while (right != null) {
            // swap
            val rightValue = checkNotNull(right.`val`)
            right.`val` = checkNotNull(left?.`val`)
            left?.`val` = rightValue

            right = right.next?.next
            left = left?.next?.next
        }

        return head
    }
}
```

