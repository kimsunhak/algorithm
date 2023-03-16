### [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: Linked List Two Pointers

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
    fun middleNode(head: ListNode?): ListNode? {
        var middle = head
        var last = head

        while(last?.next != null) {
            middle = middle!!.next
            last = last.next!!.next
        }

        return middle
    }
}
```

