### [409. Longest Palindrome](https://leetcode.com/problems/longest-palindrome/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### `Hash Table` `String` `Greedy`

```kotlin
class Solution {
    fun longestPalindrome(s: String): Int {
        val set = mutableSetOf<Char>()
        var pointer = 0

        s.forEach {
            if (!set.add(it)) {
                set.remove(it)
                pointer++
            }
        }
        return pointer * 2 + set.isEmpty().let {
            if (it) 0 else 1
        }
    }
}
```

