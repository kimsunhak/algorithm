### [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/?envType=study-plan&id=level-1)

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
    fun reverseList(head: ListNode?): ListNode? {
        var current: ListNode? = head
        var prev: ListNode? = null
        var next: ListNode? = null

        while(current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev
    }
}
```

