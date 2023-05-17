### [2130. Maximum Twin Sum of a Linked List](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/)

##### Language : Kotlin

##### Tags: `Linked List` `Two Pointers` `Stack`

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
    fun pairSum(head: ListNode?): Int {
        var answer = 0
        val list = mutableListOf<Int>()
        var node = checkNotNull(head)

        while(node.next != null) {
            list.add(node.`val`)
            node = checkNotNull(node.next)
        }

        list.add(node.`val`)
        
        for (i in 0 until list.size / 2) {
            answer = answer.coerceAtLeast(list[i] + list[list.lastIndex - i])
        }

        return answer
    }
}
```

