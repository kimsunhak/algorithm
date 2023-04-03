### [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Hash Table` `Linked List`

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
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while(slow?.next != null && fast?.next?.next != null) {
            slow = slow.next
            fast = fast.next?.next
            if (slow == fast) return true
        }

        return false
    }
}
```

