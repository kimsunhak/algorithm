### [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/?envType=study-plan&id=data-structure-i)

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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) return null

        head.next = removeElements(head.next, `val`)

        return if (head.`val` == `val`) head.next else head
    }
}
```

